package com.csu._2装配Bean;

import com.sun.xml.internal.bind.v2.TODO;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 通过Java代码定义了spring的装配规则
 *
 * Created by sharp on 2017/7/13 - 15:25
 */
//TODO 扫描组件配置方式1
@Configuration
@ComponentScan //注解启用了扫描组件, 在spring中启用扫描组件, 默认扫描与配置类相同的包
public class CDPlayerConfig {
}
