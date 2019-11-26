package com.lsg.community.dto;

import lombok.Data;

/**
 * 描述
 *
 * @outhor 李曙光
 * @time 2019-11-25  20:49
 */
@Data
public class QuestionQueryDTO {
    private String search;
    private Integer page;
    private Integer size;
}
