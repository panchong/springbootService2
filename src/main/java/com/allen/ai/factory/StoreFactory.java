package com.allen.ai.factory;

import com.allen.ai.factory.store.ICommodity;
import com.allen.ai.factory.store.impl.CardCommodityService;
import com.allen.ai.factory.store.impl.CouponCommodityService;
import com.allen.ai.factory.store.impl.GoodsCommodityService;

public class StoreFactory {

    public ICommodity getCommodityService(Integer commodityType){
        if(null == commodityType) return null;
        if(1 == commodityType) return new CardCommodityService();
        if(2 == commodityType) return new CouponCommodityService();
        if(3 == commodityType) return new GoodsCommodityService();
        throw new RuntimeException("不存在的商品服务类型");
    }
}
