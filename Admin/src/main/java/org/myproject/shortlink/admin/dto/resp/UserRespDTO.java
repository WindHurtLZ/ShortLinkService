package org.myproject.shortlink.admin.dto.resp;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import org.myproject.shortlink.admin.common.serialize.PhoneDesensitizationSerializer;

/**
 * User Response Parameter
 */
@Data
public class UserRespDTO {

    private Long id;

    private String username;

    private String realName;

    @JsonSerialize(using = PhoneDesensitizationSerializer.class)
    private String phone;

    private String email;
}
