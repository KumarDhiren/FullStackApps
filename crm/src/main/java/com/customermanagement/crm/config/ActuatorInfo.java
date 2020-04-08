package com.customermanagement.crm.config;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class ActuatorInfo implements InfoContributor {

    private Map<String, Object> getMap() {
        Map<String,Object> map = new HashMap<>();
        map.put("teamName", "payments");
        map.put("leadName", "dhiren");
        map.put("contributorOne", "mir");
        map.put("contributorTwo", "ganesh");
        return map;
    }


    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetails(getMap()).build();
    }
}
