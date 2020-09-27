package com.zdzhong.zdzordersystem.client;

import com.zdzhong.zdzordersystem.OrderTradeService;
import com.zdzhong.zdzordersystem.model.OrderTrade;
import com.zdzhong.zdzordersystem.service.IOrderTradeService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@FeignClient(value = OrderTradeService.SERVICE_NAME, fallback = OrderTradeRemoteService.HystrixOrderTradeService.class)
public interface OrderTradeRemoteService extends IOrderTradeService {

    @Component
    public static class HystrixOrderTradeService implements OrderTradeRemoteService {

        @Override
        public Integer insert(OrderTrade orderTrade) {
            return null;
        }

        @Override
        public OrderTrade selectById(Integer id) {
            return null;
        }
    }
}
