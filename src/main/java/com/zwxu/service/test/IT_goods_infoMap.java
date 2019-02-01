package com.zwxu.service.test;

import com.zwxu.entity.test.t_googs_info;
import com.zwxu.request.buy;
import org.springframework.stereotype.Repository;

@Repository
public interface IT_goods_infoMap {
    public t_googs_info getGoodsRest(String code);
    public int updateGoodsAmount(buy b);
    public int updateGoodsAmountv(buy b);
}
