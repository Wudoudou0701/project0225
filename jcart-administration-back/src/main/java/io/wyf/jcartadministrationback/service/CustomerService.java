package io.wyf.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.wyf.jcartadministrationback.dto.out.CustomerListOutDTO;
import io.wyf.jcartadministrationback.dto.out.CustomerShowOutDTO;

public interface CustomerService {

    Page<CustomerListOutDTO> search(Integer pageNum);

    void disable(Integer customerId);

    CustomerShowOutDTO getById(Integer customerId);
}
