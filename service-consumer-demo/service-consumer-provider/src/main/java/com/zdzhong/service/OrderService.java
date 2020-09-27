package com.zdzhong.service;

import com.zdzhong.requestmodel.OrderRequest;
import com.zdzhong.responsemodel.OrderResponse;
import com.zdzhong.zdzordersystem.model.OrderTrade;
import com.zdzhong.zdzordersystem.service.IOrderTradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private IOrderTradeService orderTradeService;

    public Integer save(OrderRequest orderRequest) {
        OrderTrade orderTrade = new OrderTrade();
        orderTrade.setId(orderRequest.getId());
        orderTrade.setUid(orderRequest.getUid());
        return orderTradeService.insert(orderTrade);
    }

    public OrderResponse selectById(OrderRequest orderRequest) {
        OrderTrade orderTrade = orderTradeService.selectById(orderRequest.getId());
        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setId(orderTrade.getId());
        orderResponse.setUid(orderTrade.getUid());
        return orderResponse;
    }
}