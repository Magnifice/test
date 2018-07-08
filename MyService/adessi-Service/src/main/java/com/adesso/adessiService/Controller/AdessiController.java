package com.adesso.adessiService.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdessiController implements AdessiRestInterface {
    @Autowired
    private Environment env;

    @Value("${course}")
    private String binPrivat;

    @RequestMapping("/adessi/courseAttended")
    public String safetyFirst (){
        return binPrivat;
    }

    @RequestMapping("/adessi/job")
    public String getPort (){
        return env.getProperty("local.server.port");
    }

    @RequestMapping("/")
    public String getRoot (){
        return null;
    }

    @Override
    public String getFirstName() {
        return "Yoshi";
    }

    @Override
    public String getLastName() {
        return "G";
    }

    @Override
    public String getLineOfBusiness() {
        return "Lineof";
    }

    @Override
    public String getCompetenceCenter() {
        return "JavaCC";
    }

    @Override
    public String getCompetenceCenterLeader() {
        return "UWE";
    }

    @Override
    public String getJobDescription() {
        return "Programming";
    }
}
