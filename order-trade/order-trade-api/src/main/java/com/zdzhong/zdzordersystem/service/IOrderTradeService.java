package com.zdzhong.zdzordersystem.service;

import com.zdzhong.zdzordersystem.model.OrderTrade;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface IOrderTradeService {

    @RequestMapping(value = "/orderTrade/save", method = RequestMethod.POST)
    Integer insert(@RequestBody OrderTrade orderTrade);

    @RequestMapping(value = "/orderTrade/selectById", method = RequestMethod.POST)
    OrderTrade selectById(@RequestBody Integer id);
}
