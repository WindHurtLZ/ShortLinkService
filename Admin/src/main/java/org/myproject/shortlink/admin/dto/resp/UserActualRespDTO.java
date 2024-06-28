package org.myproject.shortlink.admin.dto.resp;

import lombok.Data;

/**
 * User Actual Response Parameter
 */
@Data
public class UserActualRespDTO {

    private Long id;

    private String username;

    private String realName;

    private String phone;

    private String email;
}
