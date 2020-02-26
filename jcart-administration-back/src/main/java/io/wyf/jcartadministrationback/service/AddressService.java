package io.wyf.jcartadministrationback.service;

import io.wyf.jcartadministrationback.dto.out.AddressListOutDTO;
import org.springframework.stereotype.Service;

@Service
public interface AddressService {

    AddressListOutDTO getById(Integer addressId);
}
