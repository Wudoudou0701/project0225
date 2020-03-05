package io.wyf.jcartadministrationback.service;

import io.wyf.jcartadministrationback.dto.out.AddressListOutDTO;
import io.wyf.jcartadministrationback.po.Address;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AddressService {

    Address getById(Integer addressId);

    List<Address> getByCustomerId(Integer customerId);
}
