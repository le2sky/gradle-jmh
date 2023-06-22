package com.example.config;

import com.example.proxybean.Bean1;
import com.example.proxybean.Bean2;
import com.example.proxybean.Common;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseProxyBeanConfiguration {

    @Bean
    public Common common() {
        return new Common();
    }

    @Bean
    public Bean1 Bean1() {
        return new Bean1(common());
    }

    @Bean
    public Bean2 Bean2() {
        return new Bean2(common());
    }
}
