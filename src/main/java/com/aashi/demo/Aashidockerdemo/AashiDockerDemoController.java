package com.aashi.demo.Aashidockerdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AashiDockerDemoController {

   // @GetMapping("/hello")
    @RequestMapping(value = "/hello" , method = RequestMethod.GET)
    public String hello() {
        return "Docker Demo - Hello Aashi";
    }
}
