/**
 * @auther KevinWu
 * @date 2024年08月08日 23:24
 */
package com.cloud_native.app.controller;

import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class HelloController {

    @RateLimiter(name = "helloLimiter")
    @GetMapping("/hello")
    public Map<String, String> sayHello() {
        return Collections.singletonMap("msg", "hello");
    }
}
