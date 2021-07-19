package cn.me.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class DemoSpringbootApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoSpringbootApplication.class);
    }
}