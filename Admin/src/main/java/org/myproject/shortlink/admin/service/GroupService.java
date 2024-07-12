package org.myproject.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.myproject.shortlink.admin.dao.entity.GroupDO;

/**
 * Group Interface Layer
 */
public interface GroupService extends IService<GroupDO> {

    /**
     * Add New Short-link Group
     * @param groupName Name of group
     */
    void saveGroup(String groupName);
}
