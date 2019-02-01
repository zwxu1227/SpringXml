package com.zwxu.service.dao;

import com.zwxu.entity.yiplus.T_info_payinfo;
import com.zwxu.request.YiPlusAgentRequest;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IT_info_payinfoMap {
    List<T_info_payinfo> getList(YiPlusAgentRequest request);
}
