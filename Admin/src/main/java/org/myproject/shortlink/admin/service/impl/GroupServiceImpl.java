package org.myproject.shortlink.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.myproject.shortlink.admin.dao.entity.GroupDO;
import org.myproject.shortlink.admin.dao.mapper.GroupMapper;
import org.myproject.shortlink.admin.service.GroupService;
import org.springframework.stereotype.Service;

/**
 * Group Interface Implement Layer
 */
@Slf4j
@Service
public class GroupServiceImpl extends ServiceImpl<GroupMapper, GroupDO> implements GroupService {
}
