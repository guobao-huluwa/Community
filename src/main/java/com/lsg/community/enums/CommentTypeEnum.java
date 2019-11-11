package com.lsg.community.enums;

/**
 * 描述
 *
 * @outhor 李曙光
 * @time 2019-11-05  17:13
 */
public enum  CommentTypeEnum {
    QUESTION(1),
    COMMENT(2);
    private Integer type;



    public Integer getType() {
        return type;
    }

    public static boolean isExist(Integer type) {
        for (CommentTypeEnum commentTypeEnum : CommentTypeEnum.values()) {
            if (commentTypeEnum.getType().equals(type)){
                return  true;
            }
        }
        return false;
    }
    CommentTypeEnum(Integer type) {
        this.type = type;
    }
}
