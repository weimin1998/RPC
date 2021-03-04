package com.weimin.rmiserver.service;


import com.weimin.rmiserver.pojo.User;

public interface IUserService {
    User getUserById(Integer id);
}
