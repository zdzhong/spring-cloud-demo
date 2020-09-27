package com.zdzhong.zdzordersystem.service;

import com.zdzhong.zdzordersystem.mapper.OrderTradeMapper;
import com.zdzhong.zdzordersystem.model.OrderTrade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderTradeService {

    @Autowired
    private OrderTradeMapper orderTradeMapper;

    public Integer insert(OrderTrade orderTrade) {
        return orderTradeMapper.insert(orderTrade);
    }

    public OrderTrade selectById(Integer id) {
        return orderTradeMapper.selectById(id);
    }
}
