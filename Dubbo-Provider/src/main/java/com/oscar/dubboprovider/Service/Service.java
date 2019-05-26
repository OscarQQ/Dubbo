package com.oscar.dubboprovider.Service;

import com.Oscar.Model.User;
import com.oscar.dubboprovider.DAO.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@com.alibaba.dubbo.config.annotation.Service
public class Service implements com.Oscar.Service.Service {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    UserDAO DAO;

    @Override
    public String hello(String name) {
        return "hi, "+name;
    }

    @Override
    public User getUser(int id) {
        return DAO.getUser(id);
    }
}
