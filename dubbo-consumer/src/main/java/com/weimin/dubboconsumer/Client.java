package com.weimin.dubboconsumer;


import com.weimin.dubbocommon.pojo.User;
import com.weimin.dubbocommon.service.IUserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class Client implements CommandLineRunner {

    // 生产者和消费者 在一台机器上 并且注册中心是multicast  必须 设置parameters = {"unicast","false"}
    //@Reference(version = "1.0",parameters = {"unicast","false"})
    @Reference(version = "1.0")
    IUserService iUserService;
    @Override
    public void run(String... args) throws Exception {
        System.out.println(iUserService);
        User userById = iUserService.getUserById(1);
        System.out.println(userById);
    }
}
