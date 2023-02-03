package com.ossez.framework.controller;

import com.ossez.framework.service.GoogleEncryptionService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * HomeController Endpoint to check service running and weChat verification response
 */
@Slf4j
@RestController
@RequestMapping("/home")
public class HomeController {
    private final GoogleEncryptionService googleEncryptionService;

    @Autowired
    public HomeController(GoogleEncryptionService googleEncryptionService) {
        this.googleEncryptionService = googleEncryptionService;
    }

    @GetMapping("/index")
    public String index() {
        log.debug("Index Api Called");
        return "Welcome To check.visafn.com - " + System.currentTimeMillis();
    }

    @PostMapping("/encryption")

    public String weChatMessage(@RequestBody String weChatMessage) {
        log.debug("Receive message from WeChat - [{}]", weChatMessage);
        String weChatMessageStr = googleEncryptionService.decryptPrice(weChatMessage);
        log.debug("Response message to WeChat - [{}]",weChatMessageStr);
        return weChatMessageStr;
    }
}
