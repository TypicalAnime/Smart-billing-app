package com.example.smart.billing.controller;

import com.example.smart.billing.io.OrderResponse;
import com.example.smart.billing.io.PaymentRequest;
import com.example.smart.billing.io.PaymentVerificationRequest;
import com.example.smart.billing.io.RazorpayOrderResponse;
import com.example.smart.billing.service.OrderService;
import com.example.smart.billing.service.RazorpayService;
import com.razorpay.RazorpayException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
@RequiredArgsConstructor
public class PaymentController {

      private final RazorpayService razorpayService;
      private final OrderService orderService;


      @PostMapping("/create-order")
      @ResponseStatus(HttpStatus.CREATED)
      public RazorpayOrderResponse createRazorpayOrder(@RequestBody PaymentRequest request) throws RazorpayException{
          return razorpayService.createOrder(request.getAmount(), request.getCurrency());
      }

      @PostMapping("/verify")
    public OrderResponse verifyPayment(@RequestBody PaymentVerificationRequest request){
           return orderService.verifyPayment(request);
      }





}
