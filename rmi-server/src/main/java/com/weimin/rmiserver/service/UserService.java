package com.weimin.rmiserver.service;

import com.weimin.rmiserver.pojo.User;
import org.springframework.stereotype.Service;


@Service
public class UserService implements IUserService{

    @Override
    public User getUserById(Integer id) {
        System.out.println("接收到客户端id:"+id);
        User user = new User();
        user.setId(id);
        user.setName("weimin");
        return user;
    }
}
