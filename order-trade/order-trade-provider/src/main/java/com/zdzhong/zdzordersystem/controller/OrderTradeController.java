package com.zdzhong.zdzordersystem.controller;

import com.zdzhong.zdzordersystem.model.OrderTrade;
import com.zdzhong.zdzordersystem.service.IOrderTradeService;
import com.zdzhong.zdzordersystem.service.OrderTradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderTradeController implements IOrderTradeService {

    @Autowired
    private OrderTradeService orderTradeService;

    @Override
    public Integer insert(@RequestBody OrderTrade orderTrade) {
        return orderTradeService.insert(orderTrade);
    }

    @Override
    public OrderTrade selectById(@RequestBody Integer id) {
        return orderTradeService.selectById(id);
    }
}
