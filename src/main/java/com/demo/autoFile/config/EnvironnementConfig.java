package com.demo.autoFile.config;

import com.demo.autoFile.TestContextBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class EnvironnementConfig {

    @Bean
    @Profile("dev")
    public TestContextBean devEnvironnementConfig(){
        return  new TestContextBean("from development profile");
    }

    @Bean
    @Profile("prod")
    public TestContextBean prodEnvironnementConfig(){
        return  new TestContextBean("from production profile");
    }
}
