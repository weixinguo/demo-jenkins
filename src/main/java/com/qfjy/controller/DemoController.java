package com.qfjy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName DemoController
 * @Description TODO
 * @Author guoweixin
 * @Date 2020/5/23
 * @Version 1.0
 */
@RestController
public class DemoController {
    @RequestMapping("info")
    public String info(){
        return "Hello Jenkins";
    }
}
