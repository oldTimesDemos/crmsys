package com.qfedu.service;

import com.qfedu.entity.CstCustomer;

import java.util.Map;

public interface CstCustomerService {

    /**
     *  根据页码查询当前页信息
     * @param page
     * @return
     */
    public Map<String,Object> findAllCustomer(int page);

    /**
     *  插入一个客户信息
     * @param cstCustomer
     */
    public void addCustomer(CstCustomer cstCustomer);
}
