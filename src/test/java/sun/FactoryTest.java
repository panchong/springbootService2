package sun;

import com.allen.ai.factory.StoreFactory;
import com.allen.ai.factory.store.ICommodity;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class FactoryTest {

    @Test
    public void test_commodity() throws Exception{
        StoreFactory storeFactory = new StoreFactory();
        ICommodity cardCommodity = storeFactory.getCommodityService(1);
        cardCommodity.sendCommodity("10001", "EGM1023938910232121323432", "791098764902132", null);

        ICommodity couponCommodity = storeFactory.getCommodityService(2);
        Map<String, String> extMap = new HashMap<String, String>();
        extMap.put("consigneeUserName","xie");
        extMap.put("consigneeUserPhone", "15200292123");
        extMap.put("consigneeUserAddress","吉林省.长春市");
        couponCommodity.sendCommodity("10001","9820198721311","1023000020112221113", extMap);

        ICommodity GoodsCommodity = storeFactory.getCommodityService(3);
    }
}
