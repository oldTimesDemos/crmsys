package com.qfedu.dao;

import com.qfedu.entity.CstCustomer;

public interface CstCustomerMapper {
    int insert(CstCustomer record);

    int insertSelective(CstCustomer record);
}