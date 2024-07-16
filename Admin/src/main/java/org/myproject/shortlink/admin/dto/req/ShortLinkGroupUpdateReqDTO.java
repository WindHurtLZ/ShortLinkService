package org.myproject.shortlink.admin.dto.req;

import lombok.Data;

@Data
public class ShortLinkGroupUpdateReqDTO {

    /**
     * Group id
     */
    private String gid;

    /**
     * Group Name
     */
    private String name;
}
