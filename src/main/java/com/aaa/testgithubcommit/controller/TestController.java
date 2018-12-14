package com.aaa.testgithubcommit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * className:TestController
 * discriptoin:
 * author:zz
 * createTime:2018-12-14 15:54
 */
@RequestMapping("test")
public class TestController {
    /**
     * 测试
     * @return
     */
    @ResponseBody
    @RequestMapping("/list")
    public Object list(){
        System.out.println("随便改111111111111111111");
        System.out.println("2222222");
        return "hello";

    }
}
