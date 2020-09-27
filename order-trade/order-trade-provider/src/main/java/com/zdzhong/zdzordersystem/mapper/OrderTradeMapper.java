package com.zdzhong.zdzordersystem.mapper;

import com.zdzhong.zdzordersystem.model.OrderTrade;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderTradeMapper {
    Integer insert(OrderTrade orderTrade);

    OrderTrade selectById(Integer id);
}
