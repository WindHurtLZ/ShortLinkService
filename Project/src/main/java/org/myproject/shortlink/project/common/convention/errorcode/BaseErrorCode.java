package org.myproject.shortlink.project.common.convention.errorcode;

public enum BaseErrorCode implements IErrorCode {

    // ********** Primary macro error codes : Client errors **********
    CLIENT_ERROR("A000001", "Client-side error"),
    // ========== Secondary macro error codes : User registration errors ==========
    USER_REGISTRATION_ERROR("A000100", "User registration error"),
    USER_NAME_VERIFY_ERROR("A000110", "Username verification failed"),
    USER_NAME_EXIST_ERROR("A000111", "Username already exist"),
    USER_NAME_SENSITIVE_ERROR("A000112", "Username contains sensitive words"),
    USER_NAME_SPECIAL_CHARACTER_ERROR("A000113", "Username contains special characters"),
    PASSWORD_VERIFY_ERROR("A000120", "Password verification failed"),
    PASSWORD_SHORT_ERROR("A000121", "Password is too short"),
    PHONE_VERIFY_ERROR("A000151", "Phone format verification failed"),
    // ========== Secondary macro error codes: Missing Idempotent Tokens in System Requests ==========
    IDEMPOTENT_TOKEN_NULL_ERROR("A000200", "Idempotent token is null"), // Idempotent token is null
    IDEMPOTENT_TOKEN_DELETE_ERROR("A000201", "Idempotent token has been used or expired"),


    // ********** Primary macro error codes : System Execution Errors **********
    SERVICE_ERROR("B000001", "System execution error"),
    // ========== Secondary macro error codes : System Execution Timeout ==========
    SERVICE_TIMEOUT_ERROR("B000100", "System execution timeout"),


    // ********** Primary macro error codes : Errors in Calling Third-party Services **********
    REMOTE_ERROR("C000001", "calling third-party service failed");


    // Common Fields
    private final String code;

    private final String message;

    BaseErrorCode(String code, String message) {
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
