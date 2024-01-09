package com.padophyllis.user.dao;

import com.padophyllis.feign.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserDao {
    User queryById(Long id);
}
