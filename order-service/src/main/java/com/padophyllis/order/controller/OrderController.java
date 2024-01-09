package com.padophyllis.order.controller;

import com.padophyllis.feign.pojo.Order;
import com.padophyllis.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/{id}")
    public Order queryOrderById(@PathVariable Long id){
        return orderService.queryById(id);
    }
}
