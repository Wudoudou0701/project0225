package io.wyf.jcartadministrationback.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import io.wyf.jcartadministrationback.dao.CustomerMapper;
import io.wyf.jcartadministrationback.dto.in.CustomerSetStatusInDTO;
import io.wyf.jcartadministrationback.dto.out.CustomerListOutDTO;
import io.wyf.jcartadministrationback.dto.out.CustomerShowOutDTO;
import io.wyf.jcartadministrationback.po.Customer;
import io.wyf.jcartadministrationback.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public Page<Customer> search(Integer pageNum) {
        PageHelper.startPage(pageNum, 10);
        Page<Customer> page = customerMapper.search();
        return page;
    }

    @Override
    public Customer getById(Integer customerId) {
        Customer customer = customerMapper.selectByPrimaryKey(customerId);
        return customer;
    }

    @Override
    public void setStatus(CustomerSetStatusInDTO customerSetStatusInDTO) {
        Customer customer = new Customer();
        customer.setCustomerId(customerSetStatusInDTO.getCustomerId());
        customer.setStatus(customerSetStatusInDTO.getStatus());
        customerMapper.updateByPrimaryKeySelective(customer);
    }
}
