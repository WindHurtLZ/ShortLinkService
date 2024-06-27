package org.myproject.shortlink.admin.common.convention.result;

import org.myproject.shortlink.admin.common.convention.errorcode.BaseErrorCode;
import org.myproject.shortlink.admin.common.convention.errorcode.IErrorCode;
import org.myproject.shortlink.admin.common.convention.exception.AbstractException;

import java.util.Optional;

/**
 * Global Result Object Constructor
 */
public final class Results {

    /**
     * Construct Successful Result
     */
    public static Result<Void> success() {
        return new Result<Void>()
                .setCode(Result.SUCCESS_CODE);
    }

    /**
     * Construct Successful Result with Data
     */
    public static <T> Result<T> success(T data) {
        return new Result<T>()
                .setCode(Result.SUCCESS_CODE)
                .setData(data);
    }

    /**
     * Construct Failure Result of Service
     */
    public static Result<Void> failure() {
        return new Result<Void>()
                .setCode(BaseErrorCode.SERVICE_ERROR.code())
                .setMessage(BaseErrorCode.SERVICE_ERROR.message());
    }

    /**
     * Construct Failure Result by {@link AbstractException}
     */
    public static Result<Void> failure(AbstractException abstractException) {
        String errorCode = Optional.ofNullable(abstractException.getErrorCode())
                .orElse(BaseErrorCode.SERVICE_ERROR.code());
        String errorMessage = Optional.ofNullable(abstractException.getErrorMessage())
                .orElse(BaseErrorCode.SERVICE_ERROR.message());
        return new Result<Void>()
                .setCode(errorCode)
                .setMessage(errorMessage);
    }

    /**
     * Construct Failure Result by errorCode & errorMessage
     */
    public static Result<Void> failure(String errorCode, String errorMessage) {
        return new Result<Void>()
                .setCode(errorCode)
                .setMessage(errorMessage);
    }

    /**
     * Construct Failure Result by IErrorCode
     */
    public static Result<Void> failure(IErrorCode errorCode) {
        return new Result<Void>()
                .setCode(errorCode.code())
                .setMessage(errorCode.message());
    }
}