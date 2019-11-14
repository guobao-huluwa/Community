package com.lsg.community.dto;

import com.lsg.community.model.User;
import lombok.Data;

/**
 * 描述
 *
 * @outhor 李曙光
 * @time 2019-11-11  22:03
 */
@Data
public class CommentDTO {
    private Long id;
    private Long parentId;
    private Integer type;
    private Long commentator;
    private Long gmtCreate;
    private Long gmtModified;
    private Long likeCount;
    private String content;
    private User user;
    private Integer commentCount;
}
