package com.groupeisi.Springbootkeyclock;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")
public class DemoController {

    @GetMapping
    @PreAuthorize("hasRole('ROLE_USER')")
    public String hello() {
        return "Hello from Spring Boot & Keycloak";
    }

    @GetMapping("/hello-2")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String hello2() {
        return "Hello from Spring Boot & Keycloak - ADMIN";
    }
}
