package com.zanclick.testvue.config;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsMessagingTemplate;

import javax.jms.ConnectionFactory;

/**
 * @ Description   :  mq配置类
 * @ Author        :  wusi
 * @ CreateDate    :  2019/11/8 10:38
 * @ UpdateUser    :  wusi
 * @ UpdateDate    :  2019/11/8 10:38
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */


@Configuration
public class JmsMessageingConfig {
    @Value("${activemq.broker-url}")
    private  String url;
    @Value("${activemq.user}")
    private String username;

    @Value("${activemq.password}")
    private String password;

    @Value("${activemq.enabled}")
    private Boolean enabled;

    @Value("${activemq.max-connections}")
    private Integer maxConnections;

    @Value("${activemq.expiry-timeout}")
    private Integer expiryTimeout;

    @Value("${activemq.idle-timeout}")
    private Integer idleTimeout;
    @Bean
public ConnectionFactory connectionFactory (){
    ActiveMQConnectionFactory factory= new ActiveMQConnectionFactory();
    factory.setBrokerURL(url);
    factory.setUserName(username);
    factory.setPassword(password);
    return  factory;
}
@Bean
public JmsMessagingTemplate jmsMessagingTemplate(){
    System.out.println("初始化jmsMessagingTemplate");
    JmsMessagingTemplate template= new JmsMessagingTemplate(connectionFactory());
    return template;
}

@Bean(name="sendMessage")
public  SendMessage sendMessage(){
SendMessage sendMessage = new SendMessage();
    sendMessage.setJmsMessagingTemplate(jmsMessagingTemplate());
    return sendMessage;
}
}
