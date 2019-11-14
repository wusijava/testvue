package com.zanclick.testvue.listener;

import com.zanclick.testvue.config.JmsMessaging;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @ Description   :  java类作用描述
 * @ Author        :  wusi
 * @ CreateDate    :  2019/11/8
 */

@Component
public class PayOrderListener {
    @JmsListener(destination = JmsMessaging.ORDER_NOTITY_MESSAGE)
    public void getMeg(String msg){
        System.out.println(msg);
    }
}
