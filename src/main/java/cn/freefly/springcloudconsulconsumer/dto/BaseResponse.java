package cn.freefly.springcloudconsulconsumer.dto;

import cn.freefly.springcloudconsulconsumer.enums.ResCodeEnum;
import lombok.Data;

@Data
public class BaseResponse {
    public String resCode;
    public String resMsg;
    public Object resData;

    public static BaseResponse resSuccess(String resMsg){
        return resSuccess(resMsg,null);
    }
    public static BaseResponse resSuccess(String resMsg,Object resData){
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setResCode(ResCodeEnum.成功.getCode());
        baseResponse.setResMsg(resMsg);
        baseResponse.setResData(resData);
        return baseResponse;
    }
    public static BaseResponse resFail(String resMsg){
        return resFail(resMsg,null);
    }
    public static BaseResponse resFail(String resMsg,Object resData){
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setResCode(ResCodeEnum.失败.getCode());
        baseResponse.setResMsg(resMsg);
        baseResponse.setResData(resData);
        return baseResponse;
    }
}
