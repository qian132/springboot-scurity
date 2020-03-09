package com.qian.springboot.api.response;

public class MException extends Exception {
    private static final long serialVersionUID = 1L;
    private int code;
    private String msg;

    private ResultCode resultCode;
    public ResultCode getResultCode() {
        return resultCode;
    }
    public void setErrorCode(ResultCode resultCode) {
        this.resultCode = resultCode;
    }
    public MException(String message) {
        super(message);
        this.msg = message;
        this.code = ResultCode.FAIL.code();
    }
    public MException(int code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }
    public MException(ResultCode resultCode) {
        this.code = resultCode.code();
        this.msg = resultCode.message();
    }
}
