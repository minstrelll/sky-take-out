package com.sky.properties;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "sky.wechat")
@Data
public class WeChatProperties {
    private String privateKeyFilePath;
    private String weChatPayCertFilePath;
    private String mchid;
    private String mchSerialNo;
    private String appid;
    private String notifyUrl;
    private String refundNotifyUrl;

    // Getters and Setters
    public String getPrivateKeyFilePath() {
        return privateKeyFilePath;
    }

    public String getWeChatPayCertFilePath() {
        return weChatPayCertFilePath;
    }

    public String getMchid() {
        return mchid;
    }

    public String getMchSerialNo() {
        return mchSerialNo;
    }

    public String getAppid() {
        return appid;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public String getRefundNotifyUrl() {
        return refundNotifyUrl;
    }
}
