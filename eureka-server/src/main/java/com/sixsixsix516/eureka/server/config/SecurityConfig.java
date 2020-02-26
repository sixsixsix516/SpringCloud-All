package com.sixsixsix516.eureka.server.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author sun 2020/2/25 10:32
 */
@EnableWebSecurity
public class SecurityConfig  extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // 关闭注册中心跨域保护
        http.csrf().disable();
        super.configure(http);
    }
}
