package org.myproject.shortlink.project.common.convention.result;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serial;
import java.io.Serializable;

@Data
@Accessors(chain = true)
public class Result<T> implements Serializable {

    @Serial
    private static final long serialVersionUID = 5679018624309023727L;

    /**
     * Constant Success Code
     */
    public static final String SUCCESS_CODE = "0";

    /**
     * Return Code
     */
    private String code;

    /**
     * Return Message
     */
    private String message;

    /**
     * Return Data
     */
    private T data;

    /**
     * Request ID
     */
    private String requestId;

    /**
     * Success Status
     */
    public boolean isSuccess() {
        return SUCCESS_CODE.equals(code);
    }
}
