package com.bai.ONS;

import com.aliyun.openservices.ons.api.Action;
import com.aliyun.openservices.ons.api.ConsumeContext;
import com.aliyun.openservices.ons.api.Message;
import com.aliyun.openservices.ons.api.MessageListener;

import java.util.Date;

/**
 * @author baizhanshi on 2018/12/18.
 */
public class MyMessageListener implements MessageListener {
    @Override
    public Action consume(Message message, ConsumeContext consumeContext) {
        System.out.println("Receive @" + new Date() + ": " + message);
        //此处可以写具体业务逻辑，body是具体发送的内容
        String body = new String(message.getBody());
        System.out.println("msgBody is : " + body);
        return Action.CommitMessage;
    }
}
