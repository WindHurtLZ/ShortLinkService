package org.myproject.shortlink.admin.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * User Data Object
 */
@TableName("t_user")
@Data
public class UserDO {

    private Long id;

    private String username;

    private String password;

    private String realName;

    private String phone;

    private String email;

    private Long deletionTime;

    private Date createTime;

    private Date updateTime;

    private Integer delFlag;

}
