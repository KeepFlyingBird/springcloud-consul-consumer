package cn.freefly.springcloudconsulconsumer.controller;

import cn.freefly.springcloudconsulconsumer.dto.BaseResponse;
import cn.freefly.springcloudconsulconsumer.exception.AsyncException;
import cn.freefly.springcloudconsulconsumer.service.gateway.GatewayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("/api/gateway")
public class GatewayController {
    @Autowired
    GatewayService gatewayService;

    @GetMapping(value = "/test")
    public BaseResponse testGateway(@RequestParam(value="name") String str){
        return gatewayService.testGateway(str);
    }
}
