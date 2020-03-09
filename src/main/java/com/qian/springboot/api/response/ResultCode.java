package com.qian.springboot.api.response;

/**
 * API 统一返回状态码
 */
public enum  ResultCode {
    /* 成功状态码 */
    SUCCESS(0, "Request is successful"),
    FAIL(101, "Request is failed"),
    TOKEN_INVALID(40001, "Token验证失败"),
    ACCESS_DENIED(40003, "Access denied"),
    FAIL4DELETE(50001, "Delete failed"),
    FAIL4UPDATE(50002, "Update failed"),
    LOGIN_FAiL(10000,"用户名或密码错误");

    private Integer code;
    private String message;

    ResultCode(Integer code, String message){
        this.code = code;
        this.message = message;
    }

    public Integer code(){
        return this.code;
    }

    public String message(){
        return this.message;
    }
}