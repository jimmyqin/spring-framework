package com.jimmyqin.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 扫描配置
 *
 * @author qinrongjun
 * @email qt365793530@gmail.com
 * @date 2022/8/22 16:46
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.jimmyqin")
public class MyConfig {
}
