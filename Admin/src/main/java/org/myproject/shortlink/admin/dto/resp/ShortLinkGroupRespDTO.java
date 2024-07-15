package org.myproject.shortlink.admin.dto.resp;

import lombok.Data;

/**
 * Short-link Group Response
 */
@Data
public class ShortLinkGroupRespDTO {

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
     * group custom sort order
     */
    private Integer sortOrder;
}
