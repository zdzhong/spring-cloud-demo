package com.zdzhong.controller;

import com.zdzhong.responsemodel.OrderResponse;
import com.zdzhong.responsemodel.ResponseData;
import com.zdzhong.requestmodel.OrderRequest;
import com.zdzhong.service.IOrderService;
import com.zdzhong.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController implements IOrderService {

    @Autowired
    private OrderService orderService;

    @Override
    public ResponseData<Integer> save(@RequestBody OrderRequest orderRequest) {
        ResponseData<Integer> resp = new ResponseData<>();
        resp.setData(orderService.save(orderRequest)).ok();
        return resp;
    }

    @Override
    public ResponseData<OrderResponse> selectById(OrderRequest orderRequest) {
        ResponseData<OrderResponse> resp = new ResponseData<>();
        resp.setData(orderService.selectById(orderRequest)).ok();
        return resp;
    }
}
