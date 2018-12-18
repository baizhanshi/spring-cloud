package com.bai.ONS;

import com.aliyun.openservices.ons.api.Consumer;
import com.aliyun.openservices.ons.api.ONSFactory;
import com.aliyun.openservices.ons.api.PropertyKeyConst;

import java.util.Date;
import java.util.Properties;

/**
 * @author baizhanshi on 2018/12/18.
 */
public class MyMessageConsumer {

    /**
     * 订阅消息
     */
    public void subscribe() {
        Properties properties = new Properties();
        properties.put(PropertyKeyConst.ConsumerId, MqConfigParams.CONSUMER_ID);
        properties.put(PropertyKeyConst.AccessKey, MqConfigParams.ACCESS_KEY);
        properties.put(PropertyKeyConst.SecretKey, MqConfigParams.SECRET_KEY);
        Consumer consumer = ONSFactory.createConsumer(properties);
        consumer.subscribe(MqConfigParams.TOPIC, "*", new MyMessageListener());//此处可以写父类messageListener但是必须实现方法这里就是用到了上面写的myMessageListener
        consumer.start();
        System.out.println(MqConfigParams.CONSUMER_ID + " is running @" + new Date());
    }
}
