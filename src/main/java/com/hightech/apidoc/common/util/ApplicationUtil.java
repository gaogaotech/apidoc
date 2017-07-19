package com.hightech.apidoc.common.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by zhaoyun on 17/7/19.
 */
public class ApplicationUtil implements ApplicationContextAware {
    private static ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ApplicationUtil.applicationContext = applicationContext;
    }
    public static Object getBean(String name){
        return applicationContext.getBean(name);
    }

    public static Object getBeanByClass(Class name){
        return applicationContext.getBean(name);
    }
}
