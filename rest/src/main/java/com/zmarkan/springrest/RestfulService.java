package com.zmarkan.springrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by zan on 17/08/14.
 */

@ComponentScan
@EnableAutoConfiguration
public class RestfulService {

    public static void main(String[] args){

        SpringApplication.run(RestfulService.class, args);
    }
}
