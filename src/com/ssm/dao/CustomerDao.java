package com.ssm.dao;

import com.ssm.entry.Customer;
import com.ssm.entry.QueryVo;
import org.springframework.stereotype.Repository;

import javax.management.Query;
import java.util.List;

@Repository
public interface CustomerDao {
    //查询全部客户
    List<Customer> queryAllCustomer(QueryVo vo);

    //计算客户总数
    int getCountByQueryVo(QueryVo vo);

    //增加客户
    void addCustomer(Customer customer);

    //修改客户,首先得查询客户
    Customer queryCustomerById(Integer id);

    //修改客户
    void updateCustomer(Customer customer);

    //删除客户
    void deleteCustomer(Integer id);
}
