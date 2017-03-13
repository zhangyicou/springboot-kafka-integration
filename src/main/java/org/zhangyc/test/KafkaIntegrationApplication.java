package org.zhangyc.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@ComponentScan
@EnableAutoConfiguration
@ImportResource(locations = {"classpath:applicationContext.xml"})
@SpringBootApplication
public class KafkaIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaIntegrationApplication.class, args);
	}
}
