package io.wyf.jcartstoreback.service;


import com.github.pagehelper.Page;
import io.wyf.jcartstoreback.dto.out.ProductListOutDTO;
import io.wyf.jcartstoreback.dto.out.ProductShowOutDTO;
import io.wyf.jcartstoreback.po.Product;

public interface ProductService {

    Product getById(Integer productId);

    ProductShowOutDTO getShowById(Integer productId);

    Page<ProductListOutDTO> search(Integer pageNum);

}
