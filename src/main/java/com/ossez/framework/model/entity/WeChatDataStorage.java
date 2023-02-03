package com.ossez.framework.model.entity;

import com.ossez.framework.common.enums.HttpClientCategory;
import com.ossez.framework.common.enums.StorageCategory;
import com.ossez.framework.properties.RedisProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

import java.io.Serializable;

@Getter
@Setter
@Accessors(chain = true)
public class WeChatDataStorage implements Serializable {
    private static final long serialVersionUID = -94405301936095366L;
    private StorageCategory type = StorageCategory.MEM;
    private String keyPrefix = "wx";
    @NestedConfigurationProperty
    private final RedisProperties redis = new RedisProperties();
    private HttpClientCategory httpClientCategory = HttpClientCategory.OK_HTTP;
    private String httpProxyHost;
    private Integer httpProxyPort;
    private String httpProxyUsername;
    private String httpProxyPassword;

}
