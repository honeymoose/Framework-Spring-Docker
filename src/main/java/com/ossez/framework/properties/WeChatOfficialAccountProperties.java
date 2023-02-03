package com.ossez.framework.properties;


import com.ossez.framework.model.entity.WeChatDataStorage;
import com.ossez.framework.model.entity.WeChatHost;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * WeChat Official Account Config
 *
 * @author YuCheng Hu
 */
@Data
@ConfigurationProperties(prefix = "wechat.official-account")
public class WeChatOfficialAccountProperties {
    private String appId; //微信公众号 appId
    private String secret; //微信公众号 secret
    private String token; //微信公众号 token
    private String aesKey; //微信公众号 aesKey
    private WeChatHost hosts; //自定义 host 配置
    private final WeChatDataStorage weChatDataStorage = new WeChatDataStorage();


}
