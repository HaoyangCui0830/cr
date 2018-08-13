package com.zxy.cr.web;


import com.zxy.cr.domain.UserEntity;
import com.zxy.cr.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    /**
     * 跳转的登录页面
     * @return
     */
    @RequestMapping("/saveUser")
    public String saveUser(UserEntity user){
        userService.saveUser(user);
        return "success";
    }

}
