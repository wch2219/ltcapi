package com.zz.ltcapi.entity;

public class ResultEntity {
    private int code;
    private String message;
    private Object result;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public  ResultEntity setResultData(int code, String mess, Object result){
        this.code = code;
        this.message = mess;
        this.result = result;

        return this;
    }
}
