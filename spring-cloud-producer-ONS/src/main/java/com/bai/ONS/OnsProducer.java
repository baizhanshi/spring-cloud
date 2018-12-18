package com.bai.ONS;

import com.aliyun.openservices.ons.api.Message;
import com.aliyun.openservices.ons.api.Producer;
import com.aliyun.openservices.ons.api.SendResult;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author baizhanshi on 2018/12/18.
 */
@Service
public class OnsProducer {

    private final static Logger logger = LoggerFactory.getLogger(OnsProducer.class);

    public void sendMessage(String topic, String tag, String msgStr) {
        StringBuilder logsb = new StringBuilder("send OnsMQ Msg:");
        Message msg = getInstance(topic, tag, msgStr);
        String messageId = "";
        Producer producer = CloudMQUtil.getProducer(); //你申请的producerId
        SendResult sendResult = producer.send(msg);
        messageId = sendResult.getMessageId();
        if (messageId != null && !messageId.equals("")) {
            logsb.append("[OnsProducer] : " + "{ messageId : " + messageId + " , msgStr :" + msgStr + "}");
        } else {
            logsb.append("[OnsProducer] fail: " + "{ " + " msgStr :" + msgStr + "}");
        }
        logger.debug(logsb.toString());
    }

    private static Message getInstance(String topic, String tag, String body) {
        if (body.equals("") || body == null)
            body = "";
        Message msg = new Message(topic, tag, body.getBytes());
        return msg;
    }

}
