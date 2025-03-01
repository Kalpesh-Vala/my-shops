package com.kpvala.myshop.service.order;

import com.kpvala.myshop.dto.OrderDto;
import com.kpvala.myshop.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);
    List<OrderDto> getUserOrders(Long userId);
}
