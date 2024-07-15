package org.myproject.shortlink.admin.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.myproject.shortlink.admin.dao.entity.GroupDO;
import org.myproject.shortlink.admin.dao.mapper.GroupMapper;
import org.myproject.shortlink.admin.dto.resp.ShortLinkGroupRespDTO;
import org.myproject.shortlink.admin.service.GroupService;
import org.myproject.shortlink.admin.toolkit.RandomGenerator;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Group Interface Implement Layer
 */
@Slf4j
@Service
public class GroupServiceImpl extends ServiceImpl<GroupMapper, GroupDO> implements GroupService {

    @Override
    public void saveGroup(String groupName) {
        String gid;
        do {
            gid = RandomGenerator.randomString(6);
        } while (hasGid(gid));
        GroupDO groupDO = GroupDO.builder()
                .gid(gid)
                .name(groupName)
                .sortOrder(0)
                .build();
        baseMapper.insert(groupDO);
    }

    @Override
    public List<ShortLinkGroupRespDTO> listGroup() {
        // TODO: Get Username from gateway (the user should be logged in when they use group function)
        LambdaQueryWrapper<GroupDO> queryWrapper = Wrappers.lambdaQuery(GroupDO.class)
                .eq(GroupDO::getDelFlag, 0)
                .isNull(GroupDO::getUsername)
                .orderByDesc(List.of(GroupDO::getSortOrder, GroupDO::getCreateTime));
        List<GroupDO> groupDOList = baseMapper.selectList(queryWrapper);
        return BeanUtil.copyToList(groupDOList, ShortLinkGroupRespDTO.class);
    }

    private Boolean hasGid(String gid) {
        LambdaQueryWrapper<GroupDO> queryWrapper = Wrappers.lambdaQuery(GroupDO.class)
                .eq(GroupDO::getGid, gid)
                // TODO Get Username from gateway
                .eq(GroupDO::getUsername, null);
        GroupDO hasGroup = baseMapper.selectOne(queryWrapper);
        return hasGroup != null;
    }
}
