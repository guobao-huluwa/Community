package com.lsg.community.mapper;

import com.lsg.community.model.User;


public interface UserExtMapper {
    User selectByPrimaryKey(Long id);
}