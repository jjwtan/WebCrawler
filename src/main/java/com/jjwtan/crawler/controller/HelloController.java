package com.jjwtan.crawler.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ran on 25/3/2018.
 */

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Hello there";
    }
}
