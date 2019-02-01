package com.zwxu.service.interfaces;


import com.zwxu.entity.yiplus.T_info_payinfo;
import com.zwxu.request.YiPlusAgentRequest;

import java.util.List;

public interface IT_info_payinfoService {
    List<T_info_payinfo> getList(YiPlusAgentRequest request)throws Exception;
}
