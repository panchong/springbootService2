package sun;

import com.allen.ai.afactory.CacheService;
import com.allen.ai.afactory.factory.JDKProxy;
import com.allen.ai.afactory.factory.impl.EGMCacheAdapter;
import com.allen.ai.afactory.factory.impl.IIRCacheAdapter;
import com.allen.ai.afactory.impl.CacheServiceImpl;

public class AFactoryTest {

    public void test_CacheService() throws Exception {
        CacheService proxy_EGM = JDKProxy.getProxy(CacheServiceImpl.class, new EGMCacheAdapter());
        proxy_EGM.set("user_name_01","小");
        String val01 = proxy_EGM.get("user_name_01");
        System.out.println("测试结果：" + val01);

        CacheService proxy_IIR = JDKProxy.getProxy(CacheServiceImpl.class, new IIRCacheAdapter());
        proxy_IIR.set("user_name_01","小");
        String val02 = proxy_IIR.get("user_name_01");
        System.out.println("测试结果：" + val02);
    }
}
