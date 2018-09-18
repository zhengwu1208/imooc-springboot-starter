package com.imooc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.imooc.pojo.Resource;

/**
 * Created by zhengwu on 2018/9/16.
 */
//@Controller

@Controller
@RequestMapping("/ftl")
public class FreemarkerController {
    @Autowired
    private Resource resource;

    @RequestMapping("/index")
    public String getUser(ModelMap modelMap) {
        modelMap.addAttribute("resource", resource);
        return "freemarker/index";
    }

    @RequestMapping("/center")
    public String getUserJson() {
        return "freemarker/center/center";
    }
}
