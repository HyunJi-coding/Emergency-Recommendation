package com.example.demo.social.controller;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class IndexController {

    @GetMapping("/main")
    public OAuth2AuthenticationToken home(final OAuth2AuthenticationToken oAuth2AuthenticationToken){
        return oAuth2AuthenticationToken;
    }

    @GetMapping("/index")
    public String index(){
        return "index";
    }
}
