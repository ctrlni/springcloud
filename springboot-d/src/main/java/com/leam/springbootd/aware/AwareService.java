package com.leam.springbootd.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Aware 接口
 * BeanNameAware 获得到容器中Bean的名称
 * BeanFactoryAware 获得当前Bean factory 这样可以调用容器的服务
 * ApplicationContextAware 当前的 application context ，这样可以调用容器的服务
 * MessageSourceAware 获得 message source，这样可以获得文本信息
 * ApplicationEventPublisherAware 应用发布器，可以发布时间
 * ResourceLoaderAware 获得资源加载器，可以获得外部资源文件
 */
@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {
    private String beanName;
    private ResourceLoader loader;
    @Override
    public void setBeanName(String s) {
        this.beanName=s;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader=resourceLoader;
    }

    public void out()  {
        System.out.println(beanName);
        Resource resource=loader.getResource("classpath:awaretest.text");
        try {
            System.out.println(IOUtils.toString(resource.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
