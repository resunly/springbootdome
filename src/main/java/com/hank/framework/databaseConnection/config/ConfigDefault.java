package com.hank.framework.databaseConnection.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by hank.he on 2017/8/2.
 */
//@Component
//@Configurable
public class ConfigDefault {

    @Value("${hank.testConfig}")
    private String hankConfig;

    @Value("${org.hank.testconfig}")
    private String selfConfig;

    public String getHankConfig() {
        return hankConfig;
    }

    public void setHankConfig(String hankConfig) {
        this.hankConfig = hankConfig;
    }

    public String getSelfConfig() {
        return selfConfig;
    }

    public void setSelfConfig(String selfConfig) {
        this.selfConfig = selfConfig;
    }
}
