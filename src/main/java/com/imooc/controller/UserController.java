package com.imooc.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imooc.pojo.IMoocJSONResult;
import com.imooc.pojo.User;

/**
 * Created by zhengwu on 2018/9/16.
 */
//@Controller

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/getUser")
    //    @ResponseBody
    public User getUser() {
        User user = new User();
        user.setName("jack");
        user.setAge(21);
        user.setBirthday(new Date());
        user.setPassword("123");
        user.setDesc("xxxxx=====xxxxx");
        return user;
    }

    @RequestMapping("/getUserJson")
    //    @ResponseBody
    public IMoocJSONResult getUserJson() {
        User user = new User();
        user.setName("tom222");
        user.setAge(21);
        user.setBirthday(new Date());
        user.setPassword("123");
        user.setDesc(null);
        return IMoocJSONResult.ok(user);
    }
}
