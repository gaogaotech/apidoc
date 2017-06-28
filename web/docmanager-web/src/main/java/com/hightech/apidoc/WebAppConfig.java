package com.hightech.apidoc;

import java.util.List;

import com.alibaba.fastjson.support.spring.FastJsonpHttpMessageConverter4;
import com.alibaba.fastjson.support.spring.FastJsonpResponseBodyAdvice;
import com.hightech.apidoc.web.interceptor.NavbarInterceptor;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 类WebAppConfig的实现描述：TODO 类实现描述
 *
 * @author za-panchengzhong on 2017-06-25 9:23.
 */
@Configuration
public class WebAppConfig extends WebMvcConfigurerAdapter {

    public static void main(String[] args) {
        SpringApplication.run(WebAppConfig.class, args);
    }

    /**
     * 配置拦截器
     * 
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new NavbarInterceptor()).addPathPatterns("/**")
                .excludePathPatterns("/js/*")
                .excludePathPatterns("/img/*")
                .excludePathPatterns("/css/*")
                .excludePathPatterns("/fonts/*");
    }

    @Bean
    public FastJsonpResponseBodyAdvice fastJsonpResponseBodyAdvice() {
        return new FastJsonpResponseBodyAdvice("callback", "jsonp");
    }

    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(0, new FastJsonpHttpMessageConverter4());
        super.extendMessageConverters(converters);
    }
}
