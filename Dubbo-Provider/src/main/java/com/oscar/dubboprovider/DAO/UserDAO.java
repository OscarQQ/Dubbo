package com.oscar.dubboprovider.DAO;

import com.Oscar.Model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDAO {

    @Select("SELECT * FROM dubbo")
    User getUser(int id);
}

