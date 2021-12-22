package com.ddmit.mybatis.entity;

import com.ddmit.mybatis.typehandler.Encrypt;


public class Customer {

    private Integer id;

    private Encrypt phone;

    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Encrypt getPhone() {
        return phone;
    }

    public void setPhone(Encrypt phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
