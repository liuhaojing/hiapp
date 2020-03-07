package com.fsfy.hihop.utils;

import com.fsfy.hihop.hiapputils.HiappUtilsApplication;
import org.junit.*;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HiappUtilsApplication.class)
public class TestDateTimeUtil {
    Logger logger = LoggerFactory.getLogger(getClass());

    @BeforeClass
    public static void initClass() {
        System.out.println("类开始测试-----------------");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("类测试结束-----------------");
    }

    @Before
    public void init() {
        System.out.println("方法开始测试-----------------");
    }

    @After
    public void after() {
        System.out.println("方法测试结束-----------------");
    }

    @Test
    public void testFormatString(){
        logger.info("开始测试日期格式化");
    }
}
