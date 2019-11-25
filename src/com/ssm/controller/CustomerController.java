package com.ssm.controller;

import com.ssm.entry.BaseDict;
import com.ssm.entry.Customer;
import com.ssm.entry.Page;
import com.ssm.entry.QueryVo;
import com.ssm.service.BaseDictService;
import com.ssm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("customer")
public class CustomerController {
    @Autowired
    private BaseDictService baseDictService;
    @Autowired
    private CustomerService customerService;
    @RequestMapping("queryAllCustomer")
    public ModelAndView queryAllCustomer(QueryVo vo){
        ModelAndView mv=new ModelAndView("customer");
        //查询数据字典与customer的对应数据
        List<BaseDict> fromType = baseDictService.queryBaseDict("002");
        List<BaseDict> industryType = baseDictService.queryBaseDict("001");
        List<BaseDict> levelType = baseDictService.queryBaseDict("006");
        //将数据返回给页面
        mv.addObject("fromType",fromType);
        mv.addObject("industryType",industryType);
        mv.addObject("levelType",levelType);

        Page<Customer> page = customerService.queryAllCustomer(vo);
        mv.addObject("page",page);
        mv.addObject("vo",vo);
        return mv;
    }

    @RequestMapping("edit")
    @ResponseBody
    public Customer edit(Integer id){
        Customer customer = customerService.queryCustomerById(id);
        System.out.println(customer);
        return customer;
    }
    @RequestMapping("update")
    @ResponseBody
    public String update(Customer customer){
        String msg = "1";
        try {
            customerService.updateCustomer(customer);
            msg = "0";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msg;
    }
    @RequestMapping("delete")
    @ResponseBody
    public String delete(Integer id){
        String msg = "1";
        try {
            customerService.deleteCustomer(id);
            msg = "0";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msg;
    }
    @RequestMapping("addCustomer")
    @ResponseBody
    public String addCustomer(Customer customer){
        String msg = "1";
        try {
            customerService.addCustomer(customer);
            msg = "0";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msg;
    }
}
