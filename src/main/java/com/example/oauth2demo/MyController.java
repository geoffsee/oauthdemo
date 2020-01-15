package com.example.oauth2demo;

import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/")
    public String getStuff(@RegisteredOAuth2AuthorizedClient("uaa") RegisteredOAuth2AuthorizedClient client) {
        return "This is my stuff";
    }

}
