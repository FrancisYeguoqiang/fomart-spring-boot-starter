package com.francis.starter.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

/**
 * @Author Francis
 * @Date 2021/4/24 19:32
 * @Version 1.0
 * @Description:
 */
@ConfigurationProperties(prefix = FrancisProperties.FRANCIS_PROPERTIES )
public class FrancisProperties {

    public static final String FRANCIS_PROPERTIES = "francis.format";
    private Map<String,Object> info;

    public Map<String, Object> getInfo() {
        return info;
    }

    public void setInfo(Map<String, Object> info) {
        this.info = info;
    }
}
