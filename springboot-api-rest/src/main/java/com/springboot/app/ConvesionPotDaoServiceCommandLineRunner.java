package com.springboot.app;

import database.entity.ConversionPot;
import database.service.ConversionPotDAOService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication(scanBasePackages = "database")
@Component
public class ConvesionPotDaoServiceCommandLineRunner implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(ConvesionPotDaoServiceCommandLineRunner.class);

    @Autowired
    private ConversionPotDAOService conversionPotDAOService;

    @Override
    public void run(String... arg0) throws Exception{
        ConversionPot convPot = new ConversionPot("Test","1","2","3");
        long insert = conversionPotDAOService.insert(convPot);
        log.info("Nouvelle conversion est crée : "+ convPot);
    }

}
