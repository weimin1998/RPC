package com.weimin.rmiserver.config;

import com.weimin.rmiserver.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;
import com.weimin.rmiserver.service.UserService;

@Configuration
public class ServerConfig {

    @Autowired
    UserService userService;

    /**
     * 暴露服务
     * @return
     */
    @Bean
    public RmiServiceExporter rmiServiceExporter(){
        RmiServiceExporter rmiServiceExporter = new RmiServiceExporter();

        // 暴露的服务名
        rmiServiceExporter.setServiceName("userService");

        // 暴露的服务端口
        rmiServiceExporter.setRegistryPort(2222);

        // 暴露的服务实例
        rmiServiceExporter.setService(userService);
        System.out.println(userService);

        // 暴露的服务 实现的接口
        rmiServiceExporter.setServiceInterface(IUserService.class);
        return rmiServiceExporter;
    }
}
