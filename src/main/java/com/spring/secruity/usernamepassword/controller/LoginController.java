package com.spring.secruity.usernamepassword.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName LoginController
 * Description TODO
 * Author jyk
 * Date 2019/12/25 9:42
 **/
@Controller
@RequestMapping()
public class LoginController {

    @RequestMapping("/login")
    public String dologin(String username, String password){
        return "";
    }
}
