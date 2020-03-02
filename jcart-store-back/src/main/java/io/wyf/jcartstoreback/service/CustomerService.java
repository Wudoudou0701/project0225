package io.wyf.jcartstoreback.service;

import io.wyf.jcartstoreback.dto.in.CustomerRegisterInDTO;
import io.wyf.jcartstoreback.po.Customer;

public interface CustomerService {

    Integer register(CustomerRegisterInDTO customerRegisterInDTO);

    Customer getByUsername(String username);

    Customer getById(Integer customerId);

    Customer getByEmail(String email);

    void update(Customer customer);

}
