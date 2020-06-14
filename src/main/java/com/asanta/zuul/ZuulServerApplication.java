package com.asanta.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.core.io.ClassPathResource;

import java.net.MalformedURLException;


@EnableZuulProxy
@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
public class ZuulServerApplication {
	
	public static void main(String[] args) throws MalformedURLException {

//        Object[] sources = {SpringCloudZuulExampleApplication.class, new UrlResource(new URL("file:C:/dev/abc_dynamic.groovy"))};
		Object[] sources = {ZuulServerApplication.class, new ClassPathResource ("groovy/ExampleSurgicalDebugFilterBean.groovy")};
		SpringApplication.run(( Class < ? >[] ) sources , args);
		
	}
	
	
	
}
