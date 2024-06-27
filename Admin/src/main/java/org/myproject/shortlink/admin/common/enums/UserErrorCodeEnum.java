package org.myproject.shortlink.admin.common.enums;

import org.myproject.shortlink.admin.common.convention.errorcode.IErrorCode;

public enum UserErrorCodeEnum implements IErrorCode {

    USER_NOT_EXIST("B00200", "User does not exist"),
    USER_ALREADY_EXIST("B00201", "User already exist");


    private final String code;
    private final String message;

    UserErrorCodeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String code() {
        return code;
    }

    @Override
    public String message() {
        return message;
    }
}
