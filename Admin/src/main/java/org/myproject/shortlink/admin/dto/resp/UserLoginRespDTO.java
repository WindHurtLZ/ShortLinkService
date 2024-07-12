package org.myproject.shortlink.admin.dto.resp;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * User Login Response
 */
@Data
@AllArgsConstructor
public class UserLoginRespDTO {

    /**
     * User Token
     */
    private String token;
}
