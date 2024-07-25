package org.myproject.shortlink.project.service.Impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.myproject.shortlink.project.dao.entity.LinkDO;
import org.myproject.shortlink.project.dao.mapper.LinkMapper;
import org.myproject.shortlink.project.dto.req.linkCreateReqDTO;
import org.myproject.shortlink.project.dto.resp.linkCreateRespDTO;
import org.myproject.shortlink.project.service.LinkService;
import org.myproject.shortlink.project.toolkit.HashUtil;
import org.springframework.stereotype.Service;

/**
 * Short-link interface implement layer
 */
@Slf4j
@Service
public class LinkServiceImpl extends ServiceImpl<LinkMapper, LinkDO> implements LinkService {

    @Override
    public linkCreateRespDTO createLink(linkCreateReqDTO requestParam) {
        String suffix = generateSuffix(requestParam.getOriginUrl());
        LinkDO linkDO = BeanUtil.toBean(requestParam, LinkDO.class);
        linkDO.setShortUri(suffix);
        linkDO.setFullShortUrl(requestParam.getDomain() + "/" + suffix);
        linkDO.setEnableStatus(1);
        baseMapper.insert(linkDO);
        return linkCreateRespDTO.builder()
                .fullShortUrl(linkDO.getFullShortUrl())
                .originUrl(requestParam.getOriginUrl())
                .gid(requestParam.getGid())
                .build();
    }

    private String generateSuffix(String originalUrl) {
        return HashUtil.hashToBase62(originalUrl);
    }
}
