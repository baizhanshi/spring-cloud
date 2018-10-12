package com.bai.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author baizhanshi on 2018/10/11.
 */
@Data
@Document(indexName = "wx_telesphorus_log", type = "wxtelesphoruslog", shards = 5, replicas = 1, refreshInterval = "-1")
public class WxLogDTO {

    @Id
    private String id;

    private String logNo;

    private String type;

    private String requestBody;

    private String responseBody;
}
