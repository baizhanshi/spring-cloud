package com.bai.reposity;

import com.bai.domain.WxLogDTO;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @author baizhanshi on 2018/10/11.
 */
@Repository(value = "wxlogReposity")
public interface WxLogReposity extends ElasticsearchRepository<WxLogDTO,String> {

}
