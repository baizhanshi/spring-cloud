package com.bai.ONS;

/**
 * @author baizhanshi on 2018/12/18.
 */
import com.aliyun.openservices.ons.api.*;

import java.util.Properties;

/**
 * Created by baizhanshi on 2018/12/18.
 */
public class CloudMQUtil {

    /**
     * 获取消息的 Producer
     *
     * @return Producer
     */
    public static Producer getProducer() {
        Properties properties = new Properties();
        properties.put(PropertyKeyConst.ProducerId, MqConfigParams.PRODUCER_ID);
        properties.put(PropertyKeyConst.AccessKey, MqConfigParams.ACCESS_KEY);
        properties.put(PropertyKeyConst.SecretKey, MqConfigParams.SECRET_KEY);
        Producer producer = ONSFactory.createProducer(properties);

        // 在发送消息前，必须调用start方法来启动Producer，只需调用一次即可。
        producer.start();
        return producer;
    }

}
