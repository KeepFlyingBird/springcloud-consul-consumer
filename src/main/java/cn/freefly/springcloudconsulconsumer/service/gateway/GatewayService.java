package cn.freefly.springcloudconsulconsumer.service.gateway;

import cn.freefly.springcloudconsulconsumer.dto.BaseResponse;

public interface GatewayService {
    BaseResponse testGateway(String obj);
}
