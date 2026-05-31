package com.wsp.lease;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wsp.lease.web.*.mapper")
public class AdminWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminWebApplication.class, args);
    }
}
