package com.csu._3ioc;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * bean的生命周期
 *
 * Created by sharp on 2017/7/14 - 16:35
 */

//1. 管理bean生命周期的接口
public class Car2 implements BeanFactoryAware, BeanNameAware, InitializingBean, DisposableBean {
    private String brand;
    private String color;
    private int maxSpeed;
    
    private BeanFactory beanFactory;
    private String beanName;
    
    public Car2() {
        System.out.println("调用Car2()构造方法");
        System.out.println("=================================================================");
    }
    
    public void setBean(String brand) {
        System.out.println("调用setBean设置属性");
        System.out.println("=================================================================");
    }
    
    public void introduce() {
        System.out.println("brand:" + brand + " ;color:" + color + " ;maxSpeed:" + maxSpeed);
        System.out.println("=================================================================");
    }
    
    //2. BeanFactoryAware接口方法
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("调用BeanFactoryAware.setBeanFactory()");
        System.out.println("=================================================================");
        this.beanFactory = beanFactory;
    }
    
    //3. BeanNameAware接口方法
    @Override
    public void setBeanName(String s) {
        System.out.println("调用BeanNameAware.setBeanName()");
        System.out.println("=================================================================");
        this.beanName = s;
    }
    
    //4. InitializingBean接口方法
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("调用InitializingBean.afterPropertiesSet()");
        System.out.println("=================================================================");
    }
    
    //5. DisposableBean接口方法
    @Override
    public void destroy() throws Exception {
        System.out.println("调用DisposableBean.destroy()");
        System.out.println("=================================================================");
    }
    
    //6. 通过<bean>的init-method属性指定初始化方法
    public void myInit() {
        System.out.println("调用init-method所指定的myInit(), 将maxSpeed设置为240");
        System.out.println("=================================================================");
        this.maxSpeed = 240;
    }
    
    //7. 通过<bean>的destroy-method属性指定的销毁方法
    public void myDestroy() {
        System.out.println("调用destroy-method所指定的myDestroy()销毁方法");
        System.out.println("=================================================================");
    }
    
}
