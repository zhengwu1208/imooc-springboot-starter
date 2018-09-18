package com.imooc.controller;

import com.imooc.pojo.IMoocJSONResult;
import com.imooc.pojo.Resource;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by zhengwu on 2018/9/16.
 */
@RestController
public class HelloController {
    @Autowired
    private Resource resource;

    @RequestMapping("/hello")
    public Object hello() {
        return "hello springboot";
    }

    @RequestMapping("/getResource")
    public IMoocJSONResult getResource() {
        Resource bean = new Resource();
        BeanUtils.copyProperties(resource, bean);
        return IMoocJSONResult.ok(bean);
    }

}
