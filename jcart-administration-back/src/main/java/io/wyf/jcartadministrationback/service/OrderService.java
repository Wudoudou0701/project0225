package io.wyf.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.wyf.jcartadministrationback.dto.in.OrderSearchInDTO;
import io.wyf.jcartadministrationback.dto.out.OrderListOutDTO;
import io.wyf.jcartadministrationback.dto.out.OrderShowOutDTO;
import io.wyf.jcartadministrationback.po.Order;

public interface OrderService {

    Page<OrderListOutDTO> search(OrderSearchInDTO orderSearchInDTO, Integer pageNum);

    OrderShowOutDTO getById(Long orderId);

    void update(Order order);

}
