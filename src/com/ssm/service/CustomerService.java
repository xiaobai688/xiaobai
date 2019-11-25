package com.ssm.service;

import com.ssm.entry.Customer;
import com.ssm.entry.Page;
import com.ssm.entry.QueryVo;

import java.util.List;

public interface CustomerService {

    //根据条件分页查询客户
    Page<Customer> queryAllCustomer(QueryVo vo);

    //增加客户
    void addCustomer(Customer customer);

    //修改客户,首先得查询客户
    Customer queryCustomerById(Integer id);

    //修改客户
    void updateCustomer(Customer customer);

    //删除客户
    void deleteCustomer(Integer id);

}
