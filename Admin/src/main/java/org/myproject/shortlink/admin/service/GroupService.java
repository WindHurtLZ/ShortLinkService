package org.myproject.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.myproject.shortlink.admin.dao.entity.GroupDO;
import org.myproject.shortlink.admin.dto.resp.ShortLinkGroupRespDTO;

import java.util.List;

/**
 * Group Interface Layer
 */
public interface GroupService extends IService<GroupDO> {

    /**
     * Create a new short-link group
     * @param groupName Name of group
     */
    void saveGroup(String groupName);

    /**
     * Retrieve the collection of user short-link groups
     * @return a list of user short-link groups
     */
    List<ShortLinkGroupRespDTO> listGroup();
}
