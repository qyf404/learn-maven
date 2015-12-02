package com.qyf404.learn.maven;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Random;

@Category(com.qyf404.learn.maven.SlowTests.class)
public class App2Test {


    private App app;

    @Before
    public void setUp() {
        app = new App();
    }

    @Test
    public void testAdd() throws InterruptedException {
        int a = 1;
        int b = 2;
        int result = app.add(a, b);
        Thread.currentThread().sleep(1000);

        System.out.println("---" + Thread.currentThread().getName());
        Assert.assertEquals(a + b , result);

        /**
         * 断言可能成功,可能失败
        boolean boo = new Random().nextBoolean();
        int c = boo ? 0 : 1;
        Assert.assertEquals(a + b - c , result);
         **/
    }

    @After
    public void tearDown() throws Exception {
    }

}