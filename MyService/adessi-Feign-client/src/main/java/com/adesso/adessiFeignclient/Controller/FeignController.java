package com.adesso.adessiFeignclient.Controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Application;
import feign.Feign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.support.SpringMvcContract;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class FeignController {

    @Autowired
    private EurekaClient eurekaClient;

    @Autowired
    AdessiFeignInterface feignClient;

    @RequestMapping("/services")
    public String getServices(){
        Application myApplication = eurekaClient.getApplication("AdessiService");
        List<InstanceInfo> myApps = myApplication.getInstances();
        return myApps.get(0).getHostName();
    }

    @RequestMapping("/firstName")
    public String getFirstName(){
        AdessiFeignInterface myFeignClient = Feign
                .builder()
                .contract(new SpringMvcContract())
                .target(AdessiFeignInterface.class,"http://localhost:8081");
        return myFeignClient.getFirstName();
    }

    @RequestMapping("/adessi")
    public String getAdessi(){

        String ret = "Name: " + feignClient.getFirstName()+
                      "JobDescription" + feignClient.getJobDescription()+
                      "Chef: " + feignClient.getCompetenceCenterLeader();

        return ret;
    }
}
