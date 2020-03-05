package io.wyf.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.wyf.jcartadministrationback.dto.out.OrderListOutDTO;
import io.wyf.jcartadministrationback.dto.out.OrderShowOutDTO;
import io.wyf.jcartadministrationback.po.Order;

public interface OrderService {

    Page<OrderListOutDTO> search(Integer pageNum);

    OrderShowOutDTO getById(Long orderId);

    void update(Order order);

}
