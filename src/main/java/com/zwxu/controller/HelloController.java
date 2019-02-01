package com.zwxu.controller;

import com.google.gson.Gson;
import com.zwxu.entity.yiplus.T_info_payinfo;
import com.zwxu.request.YiPlusAgentRequest;
import com.zwxu.service.interfaces.IT_goods_infoService;
import com.zwxu.service.interfaces.IT_info_payinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.inject.Inject;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

@Controller
public class HelloController {
    @Inject
    private IT_info_payinfoService service;

    @ResponseBody
    @RequestMapping
    public String hello() {
        bll.updateGoodsAmount(GOODS_ID, 1);
        return "HelloWord!!!!";
    }

    @ResponseBody
    @RequestMapping("/getList")
    public String getList(YiPlusAgentRequest request) throws Exception {
        List <T_info_payinfo> rs = service.getList(request);
        return new Gson().toJson(rs);
    }

    //参与秒杀活动的用户人数
    private static final int USER_NUM = 500;

    //产品唯一ID
    private static final String GOODS_ID = "huawei";

    //产品库存数量
    private static final int GOODS_LEFT = 60;

    //发令抢，模拟高并发
    private static CountDownLatch countDownLatch = new CountDownLatch(USER_NUM);

    private static CyclicBarrier cyc = new CyclicBarrier(USER_NUM + 1);

    //计数器，用于记录成功购买人数
    private static int successPerson = 0;

    //计数器，用于记录卖出的商品数
    private static int payoutNum = 0;
//    @Autowired
//    @Qualifier("goodsService")
    @Resource(name = "goodsServiceL")
    private IT_goods_infoService bll;

    @ResponseBody
    @RequestMapping("baygood")
    public String bayGoods() throws InterruptedException, BrokenBarrierException {
        successPerson = 0;
        payoutNum = 0;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < USER_NUM; i++) {
            new Thread(new UserRequst(GOODS_ID, 1)).start();
            if (i == USER_NUM) {
                Thread.currentThread().sleep(1000);
            }
            countDownLatch.countDown();
        }
        //Thread.currentThread().sleep(2000);
        cyc.await();
        long entTime = System.currentTimeMillis();
        System.out.println("运行时间：" + (entTime - startTime));
        System.out.println("成功买到商品的顾客人数为：" + successPerson);
        System.out.println("已售出商品个数为：" + payoutNum);
        System.out.println("剩余商品个数为：" + bll.getGoodsRest(GOODS_ID));
        return "baygood!!!!";
    }


    public class UserRequst implements Runnable {
        private String code;//购买商品的ID
        private int buys;//购买数量

        public UserRequst(String code, int buys) {
            this.code = code;
            this.buys = buys;
        }

        @Override
        public void run() {
            try {
                countDownLatch.await();//等待发令抢指令
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //成功更新库存，同步更新人数及商品个数
            boolean bl = false;
            bl = bll.updateGoodsAmount(code, buys);
            if (bl) {
                synchronized (countDownLatch) {
                    successPerson++;
                    payoutNum += buys;
                }
            }
            try {
                cyc.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }
}

