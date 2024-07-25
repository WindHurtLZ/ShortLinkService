package org.myproject.shortlink.project.dto.resp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class linkCreateRespDTO {

    /**
     * Full short link
     */
    private String fullShortUrl;

    /**
     * Original link
     */
    private String originUrl;

    /**
     * Group id
     */
    private String gid;

}
