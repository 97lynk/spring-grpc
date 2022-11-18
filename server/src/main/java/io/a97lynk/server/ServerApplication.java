package io.a97lynk.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication(scanBasePackages = "io.a97lynk")
public class ServerApplication {

    public static void main(String[] args) throws IOException, InterruptedException {

        SpringApplication.run(ServerApplication.class, args);
    }

}
