package com.qfedu.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.dao.CstCustomerMapper;
import com.qfedu.service.CstCustomerService;
import com.qfedu.vo.VCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class CstCustomerServiceImpl implements CstCustomerService {

    @Autowired
    private CstCustomerMapper customerMapper;

    @Override
    public Map<String, Object> findAllCustomer(int page) {

        PageHelper.startPage(page,5);
        List<VCustomer> list = customerMapper.findAll();

        Map map = new HashMap();
        map.put("rows",list);
        map.put("total",((Page)list).getTotal());
        return map;
    }
}
