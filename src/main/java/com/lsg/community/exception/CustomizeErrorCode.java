package com.lsg.community.exception;

public enum CustomizeErrorCode implements ICustomizeErrorCode {


    QUESTION_NOT_FOUND(2001,"你找的问题不存在，请确认后重试"),
    TARGET_PARAM_NOT_FOUND(2002,"未选中任何问题或评论进行回复"),
    NO_LOGIN(2003,"当前操作，需要登录"),
    SYS_ERROR(2004,"服务冒烟了，请稍后重试"),
    TYPE_PARAM_WRONG(2005,"评论类型错误或不存在"),
    COMMENT_NOT_FOND(2006,"你回复的的评论不存在，请确认后重试"),
    CONTENT_IS_ENPTY(2007,"输入内容不可以为空"),
    ;

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Integer getCode() {
        return code;
    }


    private  Integer code;
    private  String message;

    CustomizeErrorCode(Integer code, String message) {
        this.message = message;
        this.code = code;
    }

}
