package fn3s.java.spring.limitsservice.controllers;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import fn3s.java.spring.limitsservice.bean.LimitConfiguration;
import fn3s.java.spring.limitsservice.config.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {


    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitFromConfigurations(){


        return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
    }

    @GetMapping("/fault-tolerance-example")
    @HystrixCommand(fallbackMethod="fallbackRetrieveConfiguration")
    public LimitConfiguration retrieveConfigurations(){
        throw new RuntimeException("Not Availabel");
    }

    public LimitConfiguration fallbackRetrieveConfiguration(){
        return new LimitConfiguration(0,1);
    }
}
