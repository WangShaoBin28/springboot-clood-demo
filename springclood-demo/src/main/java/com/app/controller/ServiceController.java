package com.app.controller;

import com.app.feign.DemoFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Package com.app.controller
 * @ClassName ServiceController
 * @Author wangshaobin
 * @Date 2018/9/13 19:30
 * @Version 1.0
 * @Description:
 **/
@RestController
@RequestMapping("/springclood-demo")
public class ServiceController {

    @Autowired
    private DemoFeign demoFeign;

    @RequestMapping("/demo")
    public String demo() {
        String str = demoFeign.demo();
        return str;
    }
}
