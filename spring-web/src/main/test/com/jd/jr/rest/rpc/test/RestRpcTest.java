package com.jd.jr.rest.rpc.test;


import com.jd.jr.service.RestRpcServiceInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl;

import javax.annotation.Resource;


@RunWith(SpringJUnit4ClassRunner.class) //
@ContextConfiguration({"/spring-config.xml"}) //
public class RestRpcTest {
    private static final Logger logger = LoggerFactory.getLogger(RestRpcTest.class);

    @Resource(name="restRpcServiceInterface")
    RestRpcServiceInterface restRpcServiceInterface;
    @Test
    public   void test() throws Exception {
        logger.info("请求开始" );
        logger.info(""+restRpcServiceInterface.getItem(null));
        logger.info("请求结束");
    }
}
