package com.ossez.framework.config;

import com.ossez.framework.common.enums.HttpClientCategory;
import com.ossez.framework.properties.WeChatOfficialAccountProperties;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * .
 *
 * @author someone
 */
@Configuration
@EnableConfigurationProperties(WeChatOfficialAccountProperties.class)
//@Import({WeChatStorageAutoConfiguration.class})
public class WeChatConfiguration {




}
