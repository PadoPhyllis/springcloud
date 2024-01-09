package com.padophyllis.order.dao;

import com.padophyllis.feign.pojo.Order;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface OrderDao {
    Order queryById(Long id);
}
