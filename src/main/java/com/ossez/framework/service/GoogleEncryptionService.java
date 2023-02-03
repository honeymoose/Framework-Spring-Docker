package com.ossez.framework.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @author YuCheng
 */
@Service
@Slf4j
public class GoogleEncryptionService {
    private final ObjectMapper objectMapper;

    @Autowired
    public GoogleEncryptionService(ObjectMapper objectMapper) {

        this.objectMapper = objectMapper;
    }


    /**
     * @param url url string for google
     * @return decrypted String
     */
    public String decryptPrice(String url) {


        return "my-decryptPrice-String";
    }

}
