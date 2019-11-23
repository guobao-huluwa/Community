package com.lsg.community.dto;

import com.lsg.community.model.User;
import lombok.Data;

/**
 * 描述
 *
 * @outhor 李曙光
 * @time 2019-11-20  14:05
 */
@Data
public class NotificationDTO {
    private Long id;
    private Long gmtCreate;
    private Integer status;
    private Long notifier;
    private String notifierName;
    private String outerTitle;
    private Long outerid;
    private String typeName;
    private Integer type;
}
