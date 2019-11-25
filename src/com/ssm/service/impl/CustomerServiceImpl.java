package com.ssm.service.impl;

import com.ssm.dao.CustomerDao;
import com.ssm.entry.Customer;
import com.ssm.entry.Page;
import com.ssm.entry.QueryVo;
import com.ssm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;
    @Override
    public Page<Customer> queryAllCustomer(QueryVo vo) {
        //设置查询条件从那一条数据开始查
        vo.setStart((vo.getPage()-1)*vo.getRows());
        //查询数据结果集
        List<Customer> customers = customerDao.queryAllCustomer(vo);
        //查询到的总数据
        int count = customerDao.getCountByQueryVo(vo);
        //封装返回的page对象
        Page<Customer> page=new Page<>(count,vo.getPage(),vo.getRows(),customers);
        return page;
    }

    @Override
    public void addCustomer(Customer customer) {
        customerDao.addCustomer(customer);
    }

    @Override
    public Customer queryCustomerById(Integer id) {
        return customerDao.queryCustomerById(id);
    }

    @Override
    public void updateCustomer(Customer customer) {

        customerDao.updateCustomer(customer);
    }

    @Override
    public void deleteCustomer(Integer id) {
        customerDao.deleteCustomer(id);
    }

}
