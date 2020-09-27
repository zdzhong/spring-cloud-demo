package com.zdzhong.service;

import com.zdzhong.requestmodel.OrderRequest;
import com.zdzhong.responsemodel.OrderResponse;
import com.zdzhong.responsemodel.ResponseData;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface IOrderService {

    @RequestMapping(value = "/serviceConsumer/order/save", method = RequestMethod.POST)
    ResponseData<Integer> save(@RequestBody OrderRequest orderRequest);

    @RequestMapping(value = "/serviceConsumer/order/selectById", method = RequestMethod.POST)
    ResponseData<OrderResponse> selectById(@RequestBody OrderRequest orderRequest);

}
