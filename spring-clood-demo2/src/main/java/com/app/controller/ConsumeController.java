package com.app.controller;

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
@RequestMapping("/springclood-demo2")
public class ConsumeController {


    @RequestMapping("/demo")
    public String demo() {

        return "hello word！";
    }
}
