package cn.itcast;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import javax.swing.*;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServer {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer.class);
    }
}
