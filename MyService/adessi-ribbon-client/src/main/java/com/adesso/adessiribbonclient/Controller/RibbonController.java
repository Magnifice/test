package com.adesso.adessiribbonclient.Controller;

import com.adesso.adessiribbonclient.Config.SomeRibbonConfigs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RibbonClient(name="ribbonName", configuration=SomeRibbonConfigs.class)
@RestController
public class RibbonController {
    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Autowired
    RestTemplate restTemplate;

    private static Logger log = LoggerFactory.getLogger(RibbonController.class);

    @RequestMapping(value = "/ports")
    public String greet() {
        log.info("Enter Ports");

        String port = this.restTemplate.getForObject("http://ribbonName/adessi/job", String.class);
        return port;
    }

    @RequestMapping(value = "/")
    public String home() {
        log.info("Access /");
        return "Hi!";
    }
}
