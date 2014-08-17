package com.zmarkan.springrest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by zan on 17/08/14.
 */
@RestController
public class GreetingController {


    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/greeting",
    method = GET)
    public Greeting greeting(
            @RequestParam(
                    value="name",
                    required = false,
                    defaultValue = "World") String name){

        return new Greeting(
                counter.incrementAndGet(),
                String.format(template, name));
    }

}
