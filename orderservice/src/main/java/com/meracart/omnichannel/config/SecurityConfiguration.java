package com.meracart.omnichannel.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.oauth2.server.resource.OAuth2ResourceServerConfigurer;


@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {


    @Override
   	public void configure(HttpSecurity http) throws Exception {
       	http
           .authorizeRequests(authorize -> authorize.anyRequest().authenticated())
               .oauth2ResourceServer(OAuth2ResourceServerConfigurer::jwt);      
   	} 
}
