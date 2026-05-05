package com.rigisterNodes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.core.net.SyslogOutputStream;

@SpringBootApplication
public class RegisterMonitoringNodesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegisterMonitoringNodesApplication.class, args);

	}

}
