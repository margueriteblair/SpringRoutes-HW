package com.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping("/")
    public String index() {
        return "HELLO WORLD!!!";
    }

    @RequestMapping("/profile")
    public String profile() {
        return "This is the logged in profile page";
    }

    @RequestMapping("/test")
    public int[] test() {
        return new int[] {1, 2, 3, 7};
        //genuinely curious if this will work
    }
}
