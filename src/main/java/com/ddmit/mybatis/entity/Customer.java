package com.ddmit.mybatis.entity;

import com.ddmit.mybatis.typehandler.Encrypt;


public class Customer {

    private Integer id;

    /*需要加密/解密的字段,声明为加密类型实体类类型*/
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
