package com.csu.test.junit;


import org.junit.Assert;
import org.junit.Test;

/**
 * 数组比较断言
 *
 * Created by sharp on 2017/7/11 - 18:41
 */
public class _5Junit4断言 {
    @Test
    public void testArrayAssert() {
        String[] users = new String[]{"tom", "sharp", "tony"};
        Assert.assertArrayEquals(new String[]{"tom", "sharp", "tony"}, users);
    }
}
