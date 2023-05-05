package com.imooc.reader.service.exception;

/**
 * 业务逻辑异常
 */
public class BussniessException extends RuntimeException{
    private String code;
    private String msg;

    public BussniessException(String code,String msg){
        //super(code + ":" + msg);
        super(msg);
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
