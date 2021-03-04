package com.weimin.rmiclient;

import com.weimin.rmiserver.pojo.User;
import com.weimin.rmiserver.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class Client implements CommandLineRunner {

    @Autowired
    IUserService iUserService;
    @Override
    public void run(String... args) throws Exception {
        System.out.println(iUserService);
        User userById = iUserService.getUserById(1);
        System.out.println(userById);
    }
}
