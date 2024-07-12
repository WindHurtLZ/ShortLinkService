package org.myproject.shortlink.admin.common.enums;

import org.myproject.shortlink.admin.common.convention.errorcode.IErrorCode;

public enum UserErrorCodeEnum implements IErrorCode {

    USER_NOT_EXIST("B00200", "User does not exist"),

    USER_ALREADY_EXIST("B00210", "User already exist"),
    USERNAME_ALREADY_EXIST("B00211", "Username already exist"),

    USER_SAVE_ERROR("B00220", "User record insert error"),

    USER_LOGIN_ERROR("B00230", "User Record Not Match"),
    USER_ALREADY_LOGIN("B00231", "User Already Login");

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
