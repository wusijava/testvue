package com.zanclick.testvue.controller;

import com.zanclick.testvue.service.PayOrderService;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Description   :  java类作用描述
 * @ Author        :  wusi
 * @ CreateDate    :  2019/11/8$ 11:40$
 * @ UpdateUser    :  wusi
 * @ UpdateDate    :  2019/11/8$ 11:40$
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
@RestController
public class testController {
    @Autowired
    private PayOrderService payOrderService;
    @RequestMapping("test")
    public  void testmq(String msg){
        payOrderService.sendMessage(msg);
    }
}
