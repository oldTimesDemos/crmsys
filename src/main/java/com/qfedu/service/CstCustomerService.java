package com.qfedu.service;

import java.util.Map;

public interface CstCustomerService {

    /**
     *  根据页码查询当前页信息
     * @param page
     * @return
     */
    public Map<String,Object> findAllCustomer(int page);
}
