package org.myproject.shortlink.project.dto.req;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.util.Date;

/**
 * Short-link create DTO
 */
@Data
public class linkCreateReqDTO {

    /**
     * Domain
     */
    private String domain;

    /**
     * Original link
     */
    private String originUrl;

    /**
     * Group id
     */
    private String gid;

    /**
     * Create type 0: Console 1: API
     */
    private int createdType;

    /**
     * Lifetime 0: Forever 1: Custom
     */
    private int validDateType;

    /**
     * Valid Date
     */
    private Date validDate;

    /**
     * Description
     */
    @TableField("`describe`")
    private String describe;
}
