package com.zanclick.testvue.service.impl;

import com.zanclick.testvue.config.JmsMessaging;
import com.zanclick.testvue.config.SendMessage;
import com.zanclick.testvue.service.PayOrderService;
import org.springframework.stereotype.Service;


@Service
public class PayOrderImpl implements PayOrderService {


    @Override
    public void sendMessage(String s) {
        SendMessage.sendMessage(JmsMessaging.ORDER_NOTITY_MESSAGE, s);
    }
}
