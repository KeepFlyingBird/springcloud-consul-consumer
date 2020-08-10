package cn.freefly.springcloudconsulconsumer.service.gateway.impl;

import cn.freefly.springcloudconsulconsumer.dto.BaseResponse;
import cn.freefly.springcloudconsulconsumer.service.gateway.GatewayService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class GatewayServiceImpl implements GatewayService {
    @Override
    public BaseResponse testGateway(String obj) {
        log.info("测试数据1：{}",obj);
        return BaseResponse.resSuccess(obj);
    }
}
