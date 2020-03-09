package com.qian.springboot.api.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RestResponse {
    private int code;
    private String message;
    private Object data;


    public RestResponse(){

    }

    public static RestResponse succuess(){
        RestResponse restResponse = new RestResponse();
        restResponse.setResultCode(ResultCode.SUCCESS);
        return restResponse;
    }

    public static RestResponse succuess(Object data){
        RestResponse restResponse = new RestResponse();
        restResponse.setResultCode(ResultCode.SUCCESS);
        restResponse.setData(data);

        return restResponse;
    }

    public static RestResponse fail() {
        RestResponse restResponse = new RestResponse();
        restResponse.setResultCode(ResultCode.FAIL);

        return restResponse;
    }


    public static RestResponse fail(ResultCode resultCode) {
        RestResponse restResponse = new RestResponse();
        restResponse.setResultCode(resultCode);

        return restResponse;
    }

    public static RestResponse fail(String message) {
        RestResponse restResponse = new RestResponse();
        restResponse.setCode(ResultCode.FAIL.code());
        restResponse.setMessage(message);

        return restResponse;
    }

    public static RestResponse fail(Integer code, String message) {
        RestResponse restResponse = new RestResponse();
        restResponse.setCode(code);
        restResponse.setMessage(message);

        return restResponse;
    }

    public static RestResponse fail(ResultCode resultCode, Object data) {
        RestResponse restResponse = new RestResponse();
        restResponse.setResultCode(resultCode);
        restResponse.setData(data);

        return restResponse;
    }

    private void setResultCode(ResultCode resultCode) {
        this.code = resultCode.code();
        this.message = resultCode.message();
    }

}
