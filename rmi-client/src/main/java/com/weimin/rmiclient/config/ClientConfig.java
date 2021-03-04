package com.weimin.rmiclient.config;

import com.weimin.rmiserver.service.IUserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

@Configuration
public class ClientConfig {

    @Bean(name = "userService")
    public RmiProxyFactoryBean rmiProxyFactoryBean(){
        RmiProxyFactoryBean rmiProxyFactoryBean = new RmiProxyFactoryBean();

        rmiProxyFactoryBean.setServiceUrl("rmi://127.0.0.1:2222/userService");
        rmiProxyFactoryBean.setServiceInterface(IUserService.class);

        return rmiProxyFactoryBean;
    }
}
