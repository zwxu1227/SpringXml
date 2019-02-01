package com.zwxu.service.services;

import com.zwxu.entity.test.t_googs_info;
import com.zwxu.request.buy;
import com.zwxu.service.interfaces.IT_goods_infoService;
import com.zwxu.service.test.IT_goods_infoMap;
import org.springframework.stereotype.Service;


import javax.inject.Inject;


@Service("goodsService")
public class T_goods_infoService implements IT_goods_infoService {
    @Inject
    IT_goods_infoMap del;

    @Override
    public int getGoodsRest(String code) {
        t_googs_info info = del.getGoodsRest(code);
        return info.getAmout();
    }

    /*
        同步 -- 悲观锁*/
    @Override
    public synchronized boolean updateGoodsAmount(String code, int buys) {
        t_googs_info info = del.getGoodsRest(code);
        Integer amout = info.getAmout();
        if (amout < buys)
            return false;
        buy buy=new buy();
        buy.setCode(code);
        buy.setBuys(buys);
        return del.updateGoodsAmount(buy)>0?true:false;
    }


}
