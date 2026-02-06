package com.example.smart.billing.service;

import com.example.smart.billing.io.OrderRequest;
import com.example.smart.billing.io.OrderResponse;
import com.example.smart.billing.io.PaymentVerificationRequest;

import java.awt.print.Pageable;
import java.time.LocalDate;
import java.util.List;

public interface OrderService {
    OrderResponse createOrder(OrderRequest request);

    void deleteOrder(String orderId);

    List<OrderResponse> getLatestOrders();

    OrderResponse verifyPayment(PaymentVerificationRequest request);

    Double sumSalesByDate(LocalDate date);

    Long countByOrderDate(LocalDate date);

    List<OrderResponse> findRecentOrders();
}
