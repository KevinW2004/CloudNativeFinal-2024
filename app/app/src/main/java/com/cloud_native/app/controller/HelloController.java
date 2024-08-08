/**
 * @auther KevinWu
 * @date 2024年08月08日 17:37
 */
package com.cloud_native.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/")
    public String hello() {
        return "{\"msg\":\"hello\"}";
    }
}
