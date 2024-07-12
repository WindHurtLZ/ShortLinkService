package org.myproject.shortlink.admin.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * Short-link Group Data Object
 */
@TableName("t_group")
@Data
public class GroupDO {

    /**
     * id
     */
    private Long id;

    /**
     * group id
     */
    private String gid;

    /**
     * group name
     */
    private String name;

    /**
     * username of group creator
     */
    private String username;

    /**
     * create_time
     */
    private Date createTime;

    /**
     * update_time
     */
    private Date updateTime;

    /**
     * del_flag
     */
    private Integer delFlag;
}
