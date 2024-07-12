package org.myproject.shortlink.admin.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.myproject.shortlink.admin.common.database.BaseDO;

/**
 * Short-link Group Data Object
 */
@TableName("t_group")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GroupDO extends BaseDO {

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
}
