package com.qfedu.controller;

import com.qfedu.entity.CstCustomer;
import com.qfedu.service.CstCustomerService;
import com.qfedu.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@ResponseBody
public class CstCustomerController {

    @Autowired
    private CstCustomerService cstCustomerService;

    @RequestMapping("/customer/findAll.do")
    public JsonBean findAll(int page){
        Map<String, Object> map = cstCustomerService.findAllCustomer(page);

        return  new JsonBean(1,map);
    }

    @RequestMapping("/customer/add.do")
    public JsonBean addCustomer(CstCustomer cstCustomer){
        cstCustomerService.addCustomer(cstCustomer);

        return new JsonBean(1,null);
    }
}
