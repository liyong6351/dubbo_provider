package com.liyong.demo.dubbo_provider;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class DubboFilterApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboFilterApplication.class, args);
	}

}

