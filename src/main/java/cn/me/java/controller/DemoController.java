package cn.me.java.controller;

import cn.me.java.entity.Tmp;
import cn.me.java.service.TmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
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

    @Autowired
    private TmpService tmpService;

    @RequestMapping("/getDemo")
    public Object getDemo(Tmp tmp) {
        System.out.println(tmp);
//        Tmp tmp = new Tmp();
//        tmp.setNick("tom");
        return "<h1>"+tmpService.getTmp(tmp)+"</h1>";
    }
}
