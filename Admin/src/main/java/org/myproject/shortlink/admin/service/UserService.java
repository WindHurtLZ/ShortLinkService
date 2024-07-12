package org.myproject.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.myproject.shortlink.admin.dao.entity.UserDO;
import org.myproject.shortlink.admin.dto.req.UserLoginReqDTO;
import org.myproject.shortlink.admin.dto.req.UserRegisterReqDTO;
import org.myproject.shortlink.admin.dto.req.UserUpdateReqDTO;
import org.myproject.shortlink.admin.dto.resp.UserLoginRespDTO;
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
     * Check if Username Exist
     * @param username Username
     * @return Return ture if user exist
     */
    Boolean hasUsername(String username);

    /**
     * Register User
     * @param requestParam User Register DTO
     */
    void register(UserRegisterReqDTO requestParam);

    /**
     * Update User
     * @param requestParam User Update DTO
     */
    void update(UserUpdateReqDTO requestParam);

    /**
     * User Login
     * @param requestParam User Login Info DTO
     * @return Token DTO
     */
    UserLoginRespDTO login(UserLoginReqDTO requestParam);

    /**
     * Check if user logon
     * @param username username
     * @param token login token
     * @return login status
     */
    Boolean hasLogin(String username, String token);

    /**
     * User Logout
     *
     * @param username username
     * @param token    login token
     */
    void logout(String username, String token);
}
