package com.zwxu.service.services;

import com.zwxu.entity.test.t_googs_info;
import com.zwxu.request.buy;
import com.zwxu.service.interfaces.IT_goods_infoService;
import com.zwxu.service.test.IT_goods_infoMap;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.Random;

@Service("goodsServiceL")
public class T_goods_infoServiceL implements IT_goods_infoService {
    @Inject
    IT_goods_infoMap del;

    @Override
    public int getGoodsRest(String code) {
        t_googs_info info = del.getGoodsRest(code);
        return info.getAmout();
    }
    /*加版本控制- 乐观锁*/
   @Override
    public boolean updateGoodsAmount(String code, int buys)  {
        t_googs_info info = del.getGoodsRest(code);
        Integer amout = info.getAmout();
        if (amout < buys)
            return false;
        buy buy=new buy();
        buy.setCode(code);
        buy.setBuys(buys);
        buy.setVersion(info.getVersion());
        if(del.updateGoodsAmountv(buy)>0)
            return true;
        //如果更新失败，当前线程休眠，并错峰执行
        waitForLock();
        return updateGoodsAmount(code,buys);
    }

    private void waitForLock()  {
        try {
            Thread.sleep(new Random().nextInt(10)+1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
