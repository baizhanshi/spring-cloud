package com.bai.ONS;

/**
 * @author baizhanshi on 2018/12/18.
 */

/**
 * 公共参数配置
 *
 * @author baizhanshi
 */
public interface MqConfigParams {

    //测试ons配置文件
    public static final String TOPIC       = "D-HABOPS-AUDIT-180212";
    public static final String TAG         = "*";
    public static final String PRODUCER_ID = "PID-D-HABOPS-AUDIT-180212";
    public static final String CONSUMER_ID = "CID-D-HABOPS-AUDIT-180212";
    public static final String ACCESS_KEY  = "LTAIDRCJX5FBVFKJ";
    public static final String SECRET_KEY  = "nFyrfAQE2ge9oaLCZskWGedW2qybTC";
    public static final String ONS_ADDR    = "http://jbponsaddr-internal.aliyun.com:8080/rocketmq/nsaddr4client-internal";

}
