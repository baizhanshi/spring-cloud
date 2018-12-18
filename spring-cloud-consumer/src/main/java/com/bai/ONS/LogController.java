package com.bai.ONS;

import com.bai.domain.WxLogDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 验证elasticsearch
 * 
 * @author baizhanshi on 2018/10/12.
 */
@RestController
@RequestMapping("/log")
public class LogController {

//    @Autowired
//    private WxLogReposity wxLogReposity;

    @RequestMapping(value = "/saveLogInfo", method = RequestMethod.GET)
    public void saveLogInfo() {
        WxLogDTO wxLogDTO = new WxLogDTO();
        wxLogDTO.setId("7");
        wxLogDTO.setLogNo("1234567890");
        wxLogDTO.setType("1");
        wxLogDTO.setRequestBody("我是请求");
        wxLogDTO.setResponseBody("我是返回值");
//        wxLogReposity.save(wxLogDTO);
    }

    @RequestMapping(value = "/getLogInfo", method = RequestMethod.GET)
    public void getLogInfo() {
//        WxLogDTO wxLogDTO = wxLogReposity.findOne("7");
//
//        System.out.println(wxLogDTO.toString());

    }

    @RequestMapping(value = "/updateLogInfo", method = RequestMethod.GET)
    public String updateLogInfo() {
        WxLogDTO wxLogDTO = new WxLogDTO();
        wxLogDTO.setId("7");
        wxLogDTO.setLogNo("policy_no");
        wxLogDTO.setType("1");
        wxLogDTO.setRequestBody("我是请求555555555555");
        wxLogDTO.setResponseBody("我是返回值88888888888888");
//        wxLogReposity.save(wxLogDTO);

        return "success";
    }

    @RequestMapping(value = "/deleteLogInfo", method = RequestMethod.GET)
    public String deleteLogInfo() {

//        wxLogReposity.delete("7");

        return "success";
    }
}
