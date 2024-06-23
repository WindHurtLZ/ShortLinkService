package org.myproject.shortlink.admin.dto.resp;

import lombok.Data;

/**
 * User Response Parameter
 */
@Data
public class UserRespDTO {

    private Long id;

    private String username;

    private String realName;

    private String phone;

    private String email;
}
