package com.adesso.adessiribbonclient.Config;

import com.netflix.loadbalancer.AvailabilityFilteringRule;
import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.PingUrl;
import org.springframework.context.annotation.Bean;

public class SomeRibbonConfigs {
    @Bean
    public IPing ribbonPing(){
        return new PingUrl();
    }

    @Bean
    public IRule ribbonRule(){
        return new AvailabilityFilteringRule();
    }
}
