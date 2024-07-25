package org.myproject.shortlink.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.myproject.shortlink.project.dao.entity.LinkDO;
import org.myproject.shortlink.project.dto.req.linkCreateReqDTO;
import org.myproject.shortlink.project.dto.resp.linkCreateRespDTO;

/**
 * Short-link interface layer
 */
public interface LinkService extends IService<LinkDO> {

    /**
     * Create a short-link
     * @param requestParam linkCreateReqDTO
     * @return linkCreateRespDTO
     */
    linkCreateRespDTO createLink(linkCreateReqDTO requestParam);
}
