package com.lsg.community.exception;

/**
 * 描述
 *
 * @outhor 李曙光
 * @time 2019-10-31  20:15
 */
public class CustomizeException  extends  RuntimeException{
    private  String message;

    public CustomizeException(ICustomizeErrorCode errorCode) {
        this.message = errorCode.getMessage() ;

    }
    public CustomizeException(String message) {
        this.message=message;

    }

    @Override
    public String getMessage() {
        return message;
    }
}
