package com.lsg.community.mapper;

import com.lsg.community.model.Comment;
import com.lsg.community.model.CommentExample;
import com.lsg.community.model.Question;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface CommentExtMapper {
    int incCommentCount(Comment comment     );
}