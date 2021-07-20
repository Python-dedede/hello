package cn.me.java.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname DemoController
 * @Description TODO
 * @Date 2021/7/19 14:37
 * @Created by yuhousheng
 */

@RestController
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/getDemo")
    public Object getDemo() {
        return "demo springboot dedede1234";
    }
}
