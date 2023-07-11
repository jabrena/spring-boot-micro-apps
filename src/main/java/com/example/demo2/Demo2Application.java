package com.example.demo2;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

import static org.springframework.web.servlet.function.RouterFunctions.route;
import static org.springframework.web.servlet.function.ServerResponse.ok;

@SpringBootApplication(proxyBeanMethods = false)
@RestController
public class Demo2Application {

	@Bean
	public RouterFunction<ServerResponse> userEndpoints() {
		return route().GET("/", req -> ok().body("Hello")).build();
	}

	public static void main(String[] args) throws Exception {
		new SpringApplicationBuilder(Demo2Application.class).run(args);
	}
}
