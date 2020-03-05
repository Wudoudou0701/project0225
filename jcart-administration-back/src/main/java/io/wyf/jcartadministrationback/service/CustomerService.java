package io.wyf.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.wyf.jcartadministrationback.dto.in.CustomerSetStatusInDTO;
import io.wyf.jcartadministrationback.dto.out.CustomerListOutDTO;
import io.wyf.jcartadministrationback.dto.out.CustomerShowOutDTO;
import io.wyf.jcartadministrationback.po.Customer;

public interface CustomerService {

    Page<Customer> search(Integer pageNum);

    void setStatus(CustomerSetStatusInDTO customerSetStatusInDTO);

    Customer getById(Integer customerId);
}
