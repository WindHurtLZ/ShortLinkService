package org.myproject.shortlink.admin.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.myproject.shortlink.admin.common.database.BaseDO;

/**
 * User Data Object
 */
@TableName("t_user")
@Data
public class UserDO extends BaseDO {

    private Long id;

    private String username;

    private String password;

    private String realName;

    private String phone;

    private String email;

    private Long deletionTime;
}
