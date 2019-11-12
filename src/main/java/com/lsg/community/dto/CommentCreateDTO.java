package com.lsg.community.dto;

import lombok.Data;

/**
 * 描述
 *
 * @outhor 李曙光
 * @time 2019-11-04  15:06
 */
@Data
public class CommentCreateDTO {
    private Long parentId;
    private String content;
    private Integer type;
}
