package com.oscar.dubboprovider;

import com.Oscar.Model.User;
import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MappedTypes(User.class)
@MapperScan("com.Oscar.dubboprovider.DAO")
@SpringBootApplication
@EnableDubboConfiguration
public class DubboProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboProviderApplication.class, args);
    }

}
