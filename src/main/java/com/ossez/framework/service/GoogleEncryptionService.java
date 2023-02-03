package com.ossez.framework.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.doubleclick.crypto.DoubleClickCrypto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Base64Utils;

import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;


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

        String encryptionKey ="encryption";
        String integrityKey = "integrityKey";
        ;
        DoubleClickCrypto.Keys keys = null;
        try {
            keys = new DoubleClickCrypto.Keys(
            new SecretKeySpec(Base64Utils.encode(encryptionKey.getBytes()), "HmacSHA1"),
            new SecretKeySpec(Base64Utils.encode(integrityKey.getBytes()), "HmacSHA1"));
        } catch (InvalidKeyException e) {
            throw new RuntimeException(e);
        }

        DoubleClickCrypto.Price crypto = new DoubleClickCrypto.Price(keys);

//        String encodedPrice = httpRequest.getHeader("price");
//        double price = crypto.decodePriceValue(encodedPrice);


        return "my-decryptPrice-String";
    }

}
