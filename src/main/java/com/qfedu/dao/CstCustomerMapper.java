package com.qfedu.dao;

import com.qfedu.entity.CstCustomer;
import com.qfedu.vo.VCustomer;

import java.util.List;

public interface CstCustomerMapper {
    int insert(CstCustomer record);

    int insertSelective(CstCustomer record);

    //  查找所有的客户信息
    List<VCustomer> findAll();

}