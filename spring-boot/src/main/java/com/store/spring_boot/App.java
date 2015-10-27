package com.store.spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Hello world!
 *
 */
@Controller
@EnableAutoConfiguration
public class App {
	
	@RequestMapping("/hello")
	@ResponseBody
	   public String hello(){
		   
		   return "Hello world spring boot ";
	   }
	
    public static void main( String[] args ){
        
    	SpringApplication.run(App.class, args);
    }
}
