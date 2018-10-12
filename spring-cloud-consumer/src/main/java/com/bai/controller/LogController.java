package com.bai.controller;

import com.bai.domain.WxLogDTO;
import com.bai.reposity.WxLogReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * 验证elasticsearch
 * @author baizhanshi on 2018/10/12.
 */
@RestController
@RequestMapping("/log")
public class LogController {

    @Autowired
    private WxLogReposity wxLogReposity;

    @RequestMapping(value = "/saveLogInfo", method = RequestMethod.GET)
    public void saveLogInfo() {
        WxLogDTO wxLogDTO = new WxLogDTO();
        wxLogDTO.setLogNo("1234567890");
        wxLogDTO.setType("1");
        wxLogDTO.setRequestBody("我是请求");
        wxLogDTO.setResponseBody("我是返回值");
        wxLogReposity.save(wxLogDTO);
    }
}
