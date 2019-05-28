package com.qfedu.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.dao.CstCustomerMapper;
import com.qfedu.entity.CstCustomer;
import com.qfedu.service.CstCustomerService;
import com.qfedu.vo.VCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
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

    @Override
    public void addCustomer(CstCustomer cstCustomer) {
        String custName = cstCustomer.getCustName();

        CstCustomer cstCustomer1 = customerMapper.findByCustName(custName);
        if (cstCustomer1 != null){
            throw new RuntimeException("该客户已存在");
        }
        String cstNo = "KH";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyyddMMHHmmss");

        String format = sdf.format(new Date());

       cstNo = cstNo + format;

        //double v = ((Math.random()) * 900) + 100;
      //  String v1 = String.valueOf(v);
        //cstNo = cstNo + v;

        cstCustomer.setCustNo(cstNo);

        cstCustomer.setCustStatus(1);
        customerMapper.insertSelective(cstCustomer);
    }
}
