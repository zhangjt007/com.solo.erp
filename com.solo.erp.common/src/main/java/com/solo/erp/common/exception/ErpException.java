package com.solo.erp.common.exception;

public class ErpException extends RuntimeException {
    private int errorCode;  //异常对应的返回码
    private String errorMsg;  //异常对应的描述信息

    /**
     * Constructs a new runtime exception with {@code null} as its
     * detail message.  The cause is not initialized, and may subsequently be
     * initialized by a call to {@link #initCause}.
     */
    public ErpException() {
        super();
    }

    /**
     * Constructs a new runtime exception with the specified detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     *
     * @param message the detail message. The detail message is saved for
     *                later retrieval by the {@link #getMessage()} method.
     */
    public ErpException(String message) {
        super(message);
        errorMsg = message;
    }

    public ErpException(int code, String message) {
        super();
        errorCode = code;
        errorMsg = message;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }
}
