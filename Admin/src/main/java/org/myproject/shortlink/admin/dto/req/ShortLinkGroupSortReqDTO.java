package org.myproject.shortlink.admin.dto.req;

import lombok.Data;

/**
 * Short-link group sort request
 */
@Data
public class ShortLinkGroupSortReqDTO {

    /**
     * Group id
     */
    private String gid;

    /**
     * Group Sort order
     */
    private Integer sortOrder;
}
