package com.padophyllis.order.service;

import com.padophyllis.feign.client.UserClient;
import com.padophyllis.feign.pojo.Order;
import com.padophyllis.feign.pojo.User;
import com.padophyllis.order.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private UserClient userClient;

    public Order queryById(Long id){
        Order order = orderDao.queryById(id);

        User user = userClient.queryById(order.getUserId());

        order.setUser(user);

        return order;
    }
}
