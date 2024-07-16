package org.myproject.shortlink.admin.common.biz.user;

import com.alibaba.ttl.TransmittableThreadLocal;

import java.util.Optional;

public class UserContext {

    private static final ThreadLocal<UserInfoDTO> USER_THREAD_LOCAL = new TransmittableThreadLocal<>();

    public static void setUser(final UserInfoDTO user) {
        USER_THREAD_LOCAL.set(user);
    }

    public static void removeUser() {
        USER_THREAD_LOCAL.remove();
    }

    public static UserInfoDTO getUserInfo() {
        return USER_THREAD_LOCAL.get();
    }

    /**
     * Retrieve user id in User Context
     * @return User Id
     */
    public static Long getUserId() {
        return Optional.ofNullable(USER_THREAD_LOCAL.get())
                .map(UserInfoDTO::getId)
                .orElse(null);
    }

    /**
     * Retrieve username in User Context
     * @return User Id
     */
    public static String getUsername() {
        return Optional.ofNullable(USER_THREAD_LOCAL.get())
                .map(UserInfoDTO::getUsername)
                .orElse(null);
    }

    /**
     * Retrieve user real name in User Context
     * @return User Id
     */
    public static String getRealName() {
        return Optional.ofNullable(USER_THREAD_LOCAL.get())
                .map(UserInfoDTO::getRealName)
                .orElse(null);
    }
}
