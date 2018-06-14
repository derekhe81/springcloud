/**
 * 
 */
package com.derekhe.cloudexample.licensingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.ApplicationContext;

/**
 * @author hexuan
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@RefreshScope
public class LicensingApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(LicensingApplication.class, args);
		
            for (String name: applicationContext.getBeanDefinitionNames()) {
                System.out.println("------------------------");
            	System.out.println(name);
            }		

	}

}
