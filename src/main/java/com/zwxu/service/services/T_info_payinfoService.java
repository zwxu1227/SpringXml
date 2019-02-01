package com.zwxu.service.services;


import com.zwxu.common.InitPara;
import com.zwxu.common.TimeHelper;
import com.zwxu.common.TimeType;
import com.zwxu.entity.yiplus.T_info_payinfo;
import com.zwxu.request.YiPlusAgentRequest;
import com.zwxu.service.dao.IT_info_payinfoMap;
import com.zwxu.service.interfaces.IT_info_payinfoService;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class T_info_payinfoService implements IT_info_payinfoService {
    @Inject
    IT_info_payinfoMap dao;

    public List<T_info_payinfo> getList(YiPlusAgentRequest request) throws Exception {
        InitPara.init(request);
        if (request.getCreatetimeEnd() != null && !request.getCreatetimeEnd().equals("")) {
            String wndStr = TimeHelper.addTime(request.getCreatetimeEnd(), "yyyy-MM-dd", TimeType.DATE, 1);
            request.setCreatetimeEnd(wndStr);
        }
        return dao.getList(request);
    }
}
