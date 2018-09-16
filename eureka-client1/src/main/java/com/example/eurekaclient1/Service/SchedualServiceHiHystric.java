package com.example.eurekaclient1.Service;


import org.springframework.stereotype.Component;

/**
 * SchedualServiceHiHystric需要实现SchedualServiceHi 接口，并注入到Ioc容器中，代码如下：
 */
@Component
public class SchedualServiceHiHystric implements  SchedualServiceHi{
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name+"not exist";
    }
}
