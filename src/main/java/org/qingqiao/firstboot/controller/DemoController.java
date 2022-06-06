package org.qingqiao.firstboot.controller;

import org.qingqiao.firstboot.bean.User;
import org.qingqiao.firstboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("demo")
public class DemoController {

    @Autowired
    private UserService service;

    @RequestMapping("test")
    public String jack(Model model){
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User u = new User();
            u.setId(i);
            u.setName("大黄:" + i);
            u.setAddress("济南:" + i);
            users.add(u);
        }
        model.addAttribute("users", users);
        model.addAttribute("msg","大黄真帅!");
        return "list";
    }

    @RequestMapping("queryAll")
    public String queryAll(Model model){
        List<User> allUsers = service.getAllUser();
        model.addAttribute("list",allUsers);
        return "AllUsers";
    }

}
