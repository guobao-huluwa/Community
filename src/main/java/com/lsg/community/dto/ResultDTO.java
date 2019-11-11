package com.lsg.community.dto;

import com.lsg.community.exception.CustomizeErrorCode;
import com.lsg.community.exception.CustomizeException;
import lombok.Data;

/**
 * 描述
 *
 * @outhor 李曙光
 * @time 2019-11-05  16:59
 */
@Data
public class ResultDTO {
    private Integer code;
    private String message;

    public static  ResultDTO errorOf(Integer code,String message){
        ResultDTO resultDTO = new ResultDTO();
        resultDTO.setCode(code);
        resultDTO.setMessage(message);
        return resultDTO;
    }

    public static ResultDTO errorOf(CustomizeErrorCode errorCode) {
        return errorOf(errorCode.getCode(),errorCode.getMessage());
    }

    public static ResultDTO okOf(){
        ResultDTO resultDTO = new ResultDTO();
        resultDTO.setCode(200);
        resultDTO.setMessage("请求成功");
        return resultDTO;
    }

    public static ResultDTO errorOf(CustomizeException e) {
        return errorOf(e.getCode(),e.getMessage());
    }
}
