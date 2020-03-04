package io.wyf.jcartstoreback.service.impl;

import io.wyf.jcartstoreback.dao.OrderHistoryMapper;
import io.wyf.jcartstoreback.po.OrderHistory;
import io.wyf.jcartstoreback.service.OrderHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderHistoryServiceImpl implements OrderHistoryService {

    @Autowired
    private OrderHistoryMapper orderHistoryMapper;

    @Override
    public List<OrderHistory> getByOrderId(Long orderId) {
        List<OrderHistory> orderHistories = orderHistoryMapper.selectByOrderId(orderId);
        return orderHistories;
    }
}
