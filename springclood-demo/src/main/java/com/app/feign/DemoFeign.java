package com.app.feign;

import com.app.fallback.DemoFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Package com.app.feign
 * @ClassName DemoFeign
 * @Author wangshaobin
 * @Date 2018/9/13 19:32
 * @Version 1.0
 * @Description:
 **/
@FeignClient(value = "springclood-demo2", fallback = DemoFallback.class)
public interface DemoFeign {

    @RequestMapping("/springclood-demo2/demo")
    String demo();
}
