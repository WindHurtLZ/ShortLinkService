package org.myproject.shortlink.project.dao.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.myproject.shortlink.project.common.database.BaseDO;

import java.util.Date;

/**
 * Short-link data object
 */
@Data
@TableName("t_link")
public class LinkDO extends BaseDO {

    /**
     * id
     */
    private Long id;

    /**
     * Domain
     */
    private String domain;

    /**
     * Short link
     */
    private String shortUri;

    /**
     * Full short link
     */
    private String fullShortUrl;

    /**
     * Original link
     */
    private String originUrl;

    /**
     * Click num
     */
    private Integer clickNum;

    /**
     * Group id
     */
    private String gid;

    /**
     * Enable flag 0: Disable 1: Enable
     */
    private int enableStatus;

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
