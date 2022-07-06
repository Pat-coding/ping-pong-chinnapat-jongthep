package com.test.pingpongchinnapatjongthep;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PongController {
    @RequestMapping("/ping")
    public String pong() {
        return "pong";
    }
}
