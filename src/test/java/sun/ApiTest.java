package sun;

import com.allen.ai.IMyUserDao;
import com.allen.ai.sso.first.SsoInterceptor;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_IUserDao() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring-config.xml");
        IMyUserDao userDao = beanFactory.getBean("myUserDao", IMyUserDao.class);
        String res = userDao.queryUserInfo("100001");
        logger.info("测试结果：{}", res);
    }

    @Test
    public void test_sso(){
        SsoInterceptor ssoInterceptor = new SsoInterceptor();
        String request = "1successhuahua";
        boolean success = ssoInterceptor.preHandle(request, "ewqasd40liulu", "t");
        System.out.println("登录校验：" + request +(success ? " 放行" : " 拦截"));
    }

}