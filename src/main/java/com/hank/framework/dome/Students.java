package com.hank.framework.dome;

import java.io.Serializable;

/**
 * Created by hank.he on 2017/7/28.
 */
public class Students implements Serializable {
    private String name;
    private String sex;
    private String address;

    public Students(String name, String sex, String address) {
        this.name = name;
        this.sex = sex;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
