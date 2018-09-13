package com.app.fallback;

import com.app.feign.DemoFeign;
import org.springframework.stereotype.Component;

/**
 * @Package com.app.fallback
 * @ClassName Demofallback
 * @Author wangshaobin
 * @Date 2018/9/13 19:33
 * @Version 1.0
 * @Description:
 **/
@Component
public class DemoFallback implements DemoFeign {
    @Override
    public String demo() {
        return "调用失败";
    }
}
