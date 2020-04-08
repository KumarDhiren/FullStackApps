package com.customermanagement.crm.controller;

import com.customermanagement.crm.model.President;
import com.customermanagement.crm.repository.PresidentRepository;
import io.micrometer.core.annotation.Timed;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api")
public class ApiController {

    private final PresidentRepository presidentRepository;
    private final Counter counter;

    public ApiController(PresidentRepository presidentRepository, MeterRegistry registry){
        this.presidentRepository = presidentRepository;
        this.counter = Counter.builder("api.greeting")
                .description("Total Greetings")
                .baseUnit("times")
                .register(registry);
    }

    @GetMapping("greeting")
    public String getGreeting(){
        counter.increment();
        return "Hello LinkedIn Learning Student";
    }

    @GetMapping("presidents")
    @Timed(value = "api.getAllPresident")
    public List<President> getAllUSPresidents(){
        List<President> presidents = new ArrayList<>();
        presidents.addAll(this.presidentRepository.findAll());
        return presidents;
    }

}
