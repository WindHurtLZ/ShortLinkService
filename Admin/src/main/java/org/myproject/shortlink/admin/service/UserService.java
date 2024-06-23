package org.myproject.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.myproject.shortlink.admin.dao.entity.UserDO;
import org.myproject.shortlink.admin.dto.resp.UserRespDTO;

/**
 * User Interface Layer
 */
public interface UserService extends IService<UserDO> {

    /**
     * Query user information by username
     *
     * @param username Username
     * @return User Response Entity
     */
    UserRespDTO getUserByUsername(String username);
}
