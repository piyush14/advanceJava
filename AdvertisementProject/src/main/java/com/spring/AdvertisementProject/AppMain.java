package com.spring.AdvertisementProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;


/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
@ImportResource("advertise_app_config.xml")
public class AppMain
{
    public static void main( String[] args )
    {
    	SpringApplication.run(AppMain.class, args);    }
}
