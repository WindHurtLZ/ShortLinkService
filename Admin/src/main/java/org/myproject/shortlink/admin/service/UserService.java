package org.myproject.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.myproject.shortlink.admin.dao.entity.UserDO;
import org.myproject.shortlink.admin.dto.req.UserRegisterReqDTO;
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

    /**
     * Query if Username Exist
     * @param username Username
     * @return Return ture if user exist
     */
    Boolean hasUsername(String username);

    /**
     * Register User
     * @param requestParam User Request DTO
     */
    void register(UserRegisterReqDTO requestParam);
}
