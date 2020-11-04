package com.pro.financial.user.controller;

import com.pro.financial.user.biz.StudentBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ASUS
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private StudentBiz studentBiz;

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

}
