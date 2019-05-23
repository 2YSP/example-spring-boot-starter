package cn.sp.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by 2YSP on 2019/5/22.
 */
@ConfigurationProperties(prefix = "cn.sp")
public class StarterServiceProperties {

    private String config;

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }
}
