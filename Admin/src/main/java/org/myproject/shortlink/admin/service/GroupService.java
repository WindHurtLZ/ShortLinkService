package org.myproject.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.myproject.shortlink.admin.dao.entity.GroupDO;
import org.myproject.shortlink.admin.dto.req.ShortLinkGroupSaveReqDTO;
import org.myproject.shortlink.admin.dto.req.ShortLinkGroupUpdateReqDTO;
import org.myproject.shortlink.admin.dto.resp.ShortLinkGroupRespDTO;

import java.util.List;

/**
 * Group Interface Layer
 */
public interface GroupService extends IService<GroupDO> {

    /**
     * Create a new short-link group
     * @param requestParam Name of group
     */
    void saveGroup(ShortLinkGroupSaveReqDTO requestParam);

    /**
     * Retrieve the collection of user short-link groups
     * @return a list of user short-link groups
     */
    List<ShortLinkGroupRespDTO> listGroup();

    /**
     * Update a group
     * @param requestParam ShortLinkGroupUpdateReqDTO
     */
    void updateGroup(ShortLinkGroupUpdateReqDTO requestParam);

    /**
     * Delete a group
     * @param gid gid
     */
    void deleteGroup(String gid);
}
