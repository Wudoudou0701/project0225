package io.wyf.jcartstoreback.service;


import com.github.pagehelper.Page;
import io.wyf.jcartstoreback.dto.out.ProductListOutDTO;
import io.wyf.jcartstoreback.dto.out.ProductShowOutDTO;

public interface ProductService {

    ProductShowOutDTO getById(Integer productId);

    Page<ProductListOutDTO> search(Integer pageNum);

}
