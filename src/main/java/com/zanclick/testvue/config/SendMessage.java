package com.zanclick.testvue.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.checkerframework.checker.units.qual.A;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.messaging.MessagingException;

import javax.jms.Destination;


/**
 * @ Description   :  mq发送消息
 * @ Author        :  wusi
 * @ CreateDate    :  2019/11/8 14:08
 */

public class SendMessage {
    private  final  static Logger log= LoggerFactory.getLogger(SendMessage.class);

    private static  JmsMessagingTemplate jmsMessagingTemplate;
    public void setJmsMessagingTemplate(JmsMessagingTemplate template){
        jmsMessagingTemplate=template;
    }

    @Autowired
    private  JmsMessagingTemplate k;
 /**
  * @ param   :  方法作用描述
  * @ param   :  修改内容
  */
 public static boolean sendMessage(String Queue_name,String msg){
     log.info("队列"+Queue_name+",内容:"+msg);
     try {
         Destination destination=new ActiveMQQueue(Queue_name);
         jmsMessagingTemplate.convertAndSend(destination,msg);
         return true;
     } catch (MessagingException e) {
         log.error("队列消息发送失败");
         e.printStackTrace();
         return false;
     }
 }

}
