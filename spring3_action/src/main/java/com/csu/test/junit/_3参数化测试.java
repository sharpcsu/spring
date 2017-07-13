package com.csu.test.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * Created by sharp on 2017/7/11 - 18:38
 */
// TODO: 2017/7/12 不大会
//指定Parameterized的运行器
@RunWith(Parameterized.class)
public class _3参数化测试 {
    
    private SimpleDateFormat simpleDateFormat;
    private String date;
    private String dateformat;
    private String expectedDate;
    
    public _3参数化测试(String date, String dateformat, String expectedDate) {
        this.date = date;
        this.dateformat = dateformat;
        this.expectedDate = expectedDate;
    }
    
    //测试数据提供者
    @Parameters
    @SuppressWarnings("unchecked")
    public static Collection getParameters() {
        String[][] object = {
                {"2011-07-01 00:30:59","yyyyMMdd","20110701"},
                {"2011-07-01 00:30:59","yyyy年MM月dd日","2011年07月01日"},
                {"2011-07-01 00:30:59","HH时mm分ss秒","00时30分59秒"}};
    
        return Arrays.asList(object);
    }
    
    @Before
    public void init() {
    
    }
    
    //测试日期格式化
    @Test
    public void method() throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
        Date d = df.parse(this.date);
        simpleDateFormat = new SimpleDateFormat(this.dateformat);
        String result = simpleDateFormat.format(d);
        assertEquals(this.expectedDate, result);
    }
    
    @After
    public void destroy() {
    
    }
}
