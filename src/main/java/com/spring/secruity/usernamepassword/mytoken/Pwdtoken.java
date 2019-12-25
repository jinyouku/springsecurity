package com.spring.secruity.usernamepassword.mytoken;

import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

/**
 * @ClassName Pwdtoken
 * Description TODO
 * Author jyk
 * Date 2019/12/25 9:46
 **/
public class Pwdtoken extends AbstractAuthenticationToken {

    private final Object principal;

    public Pwdtoken(Object principal) {
        super(null);
        this.principal = principal;
        setAuthenticated(false);
    }

    public Pwdtoken(Collection<? extends GrantedAuthority> authorities, Object principal) {
        super(authorities);
        this.principal = principal;
        setAuthenticated(true);
    }


    @Override
    public Object getCredentials() {
        return null;
    }

    @Override
    public Object getPrincipal() {
        return this.principal;
    }
}
