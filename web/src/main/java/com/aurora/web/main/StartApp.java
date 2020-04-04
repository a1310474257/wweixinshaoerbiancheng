package com.aurora.web.main;



import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = "com.aurora")

@EnableAutoConfiguration
@MapperScan(basePackages = "com.aurora.web.dao")
public class StartApp {
  public static void main(String[] args) {
    SpringApplication.run(StartApp.class,args);
  }
}
