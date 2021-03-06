package com.example.springboot.demo;

import com.example.springboot.demo.service.InitService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;

@SpringBootApplication
@MapperScan("com.example.springboot.demo.repository.db.mapper")
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }

    @Autowired
    private InitService initService;

    @PostConstruct
    public void init() {
        initService.init();
    }


    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }


}
