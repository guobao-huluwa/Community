package com.lsg.community.dto;

import lombok.Data;

import java.util.List;

/**
 * 描述
 *
 * @outhor 李曙光
 * @time 2019-11-16  20:30
 */
@Data
public class TagDTO {
    private String categoryName;
    private List<String> tags;
}
