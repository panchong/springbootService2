package com.allen.ai.adapter.impl;

import com.allen.ai.adapter.OrderServiceAdapter;
import com.allen.ai.adapter.service.OrderService;

public class InsideOrderService implements OrderServiceAdapter {

    private OrderService orderService = new OrderService();

    @Override
    public boolean isFirst(String uId) {
        return orderService.queryUserOrderCount(uId) <= 1;
    }
}
