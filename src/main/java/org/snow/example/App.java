package org.snow.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 */
@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class App
{
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        SpringApplication.run(App.class, args);
        //new SpringApplicationBuilder(App.class).web(true).run(args);
    }
}
