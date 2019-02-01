package com.zwxu.service.interfaces;

public interface IT_goods_infoService {
    public  int getGoodsRest(String code);
    public boolean updateGoodsAmount(String code,int buys);
}
