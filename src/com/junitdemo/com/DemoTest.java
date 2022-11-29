package com.junitdemo.com;

import org.junit.Assert;
import org.junit.Test;

public class DemoTest {

    @Test
    public void testAdd(){
        int result;
        Demo demo=new Demo();
        result=demo.add(1,2);
        Assert.assertEquals(result,4);
    }
}
