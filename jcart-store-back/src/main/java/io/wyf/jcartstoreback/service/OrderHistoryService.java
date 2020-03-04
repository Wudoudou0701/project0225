package io.wyf.jcartstoreback.service;

import io.wyf.jcartstoreback.po.OrderHistory;

import java.util.List;

public interface OrderHistoryService {

    List<OrderHistory> getByOrderId(Long orderId);
}
