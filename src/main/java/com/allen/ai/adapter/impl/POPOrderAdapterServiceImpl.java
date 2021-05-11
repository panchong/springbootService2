package com.allen.ai.adapter.impl;

import com.allen.ai.adapter.OrderServiceAdapter;
import com.allen.ai.adapter.service.POPOrderService;

public class POPOrderAdapterServiceImpl implements OrderServiceAdapter {
    private POPOrderService popOrderService = new POPOrderService();

    @Override
    public boolean isFirst(String uId) {
        return popOrderService.isFirstOrder(uId);
    }
}
