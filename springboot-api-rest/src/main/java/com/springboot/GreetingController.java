package com.springboot;

import com.springboot.database.entity.ConversionPot;
import com.springboot.database.respository.ConversionPotRespository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greeting")
@Slf4j
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name){
        return new Greeting(counter.incrementAndGet(), String.format(template,name));
    }


    @PostMapping("/test")
    public ResponseEntity<String> test(@RequestBody ConversionPot pot){
        log.info("{}",pot);
        conversionPotRespository.save(pot);
        return ResponseEntity.status(HttpStatus.CREATED).body("Votre objet a bine été crée");
    }
}
