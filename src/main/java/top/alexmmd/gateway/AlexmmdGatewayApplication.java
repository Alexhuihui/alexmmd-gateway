package top.alexmmd.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 启动类
 */
@EnableDiscoveryClient
@SpringBootApplication
public class AlexmmdGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlexmmdGatewayApplication.class, args);
    }

}
