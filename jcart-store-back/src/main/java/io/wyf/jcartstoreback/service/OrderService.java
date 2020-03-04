package io.wyf.jcartstoreback.service;

import com.github.pagehelper.Page;
import io.wyf.jcartstoreback.dto.in.OrderCheckoutInDTO;
import io.wyf.jcartstoreback.dto.out.OrderShowOutDTO;
import io.wyf.jcartstoreback.po.Order;

public interface OrderService {
    Long checkout(OrderCheckoutInDTO orderCheckoutInDTO,
                  Integer customerId);

    Page<Order> getByCustomerId(Integer pageNum, Integer customerId);

    OrderShowOutDTO getById(Long orderId);
}
