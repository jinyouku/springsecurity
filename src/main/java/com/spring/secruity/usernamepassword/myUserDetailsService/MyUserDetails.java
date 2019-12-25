package com.spring.secruity.usernamepassword.myUserDetailsService;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.nio.file.attribute.UserPrincipal;

/**
 * @ClassName MyUserDetails
 * Description TODO
 * Author jyk
 * Date 2019/12/25 10:22
 **/
public class MyUserDetails implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //查询用户信息
        if ("jin".equals(username)){

        }
        return null;
    }
}
