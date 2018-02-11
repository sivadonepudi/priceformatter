package com.price.formatter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Entry point for this PriceformatterApplication
 * 
 * @author sidonepudi
 *
 */

@SpringBootApplication
@ComponentScan({ "com.price.formatter.controller", "com.price.formatter.service" })
public class PriceformatterApplication {

	public static void main(String[] args) {
		SpringApplication.run(PriceformatterApplication.class, args);
	}
}
