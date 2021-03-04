package com.weimin.dubboprovider.service;


import com.weimin.dubbocommon.pojo.User;
import com.weimin.dubbocommon.service.IUserService;
import org.apache.dubbo.config.annotation.Service;


@Service(version = "1.0")
public class UserService implements IUserService {

    @Override
    public User getUserById(Integer id) {
        System.out.println("接收到客户端id:"+id);
        User user = new User();
        user.setId(id);
        user.setName("weimin");
        return user;
    }
}
