package com.ddmit.mybatis.mappers;

import com.ddmit.mybatis.entity.Customer;
import com.ddmit.mybatis.typehandler.Encrypt;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface CustomerMapper {

    int addCustomer(@Param("phone") Encrypt phone, @Param("address") String address);

    Customer findCustomer(@Param("phone") Encrypt phone);
}
