package com.hightech.apidoc.biz.service;

import com.hightech.apidoc.common.constants.APIProperty;
import com.hightech.apidoc.common.constants.AppConfig;
import com.hightech.apidoc.common.util.ApplicationUtil;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.lang.reflect.Field;

/**
 * 初始化属性
 * Created by mengwei on 17/7/19.
 */
@Component
public class InitService implements InitializingBean {

    @Resource
    private APIProperty apiProperty;

    @Override
    public void afterPropertiesSet() throws Exception {
        Field[] fields = apiProperty.getClass().getDeclaredFields();
        for (Field field:fields) {
            field.setAccessible(true);
            AppConfig.set(field.getName(),(String)field.get(apiProperty));
        }
    }
}
