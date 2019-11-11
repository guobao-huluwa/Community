package com.lsg.community.exception;

/**
 * 描述
 *
 * @outhor 李曙光
 * @time 2019-10-31  20:15
 */
public class CustomizeException  extends  RuntimeException{
    private  String message;
    private  Integer code;

    public CustomizeException(ICustomizeErrorCode errorCode) {
        this.code = errorCode.getCode();
        this.message = errorCode.getMessage() ;

    }


    @Override
    public String getMessage() {
        return message;
    }

    public Integer getCode() {
        return code;
    }
}
