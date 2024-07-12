package org.myproject.shortlink.admin.dto.req;

import lombok.Data;

/**
 * User Login Request
 */
@Data
public class UserLoginReqDTO {

    /**
     * Username
     */
    private String username;

    /**
     * Password
     */
    private String password;
}
