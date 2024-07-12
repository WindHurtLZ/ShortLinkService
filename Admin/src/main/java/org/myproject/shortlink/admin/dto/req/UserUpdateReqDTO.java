package org.myproject.shortlink.admin.dto.req;

import lombok.Data;

@Data
public class UserUpdateReqDTO {

    private String username;

    private String password;

    private String realName;

    private String phone;

    private String email;
}
