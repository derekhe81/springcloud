/**
 * 
 */
package com.derekhe.cloudexample.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author hexuan
 *
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigApplicationServer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ConfigApplicationServer.class, args);

	}

}
