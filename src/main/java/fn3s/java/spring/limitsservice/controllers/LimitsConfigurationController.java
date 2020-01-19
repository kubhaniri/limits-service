package fn3s.java.spring.limitsservice.controllers;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import fn3s.java.spring.limitsservice.bean.LimitConfigurationBean;
import fn3s.java.spring.limitsservice.service.impl.LimitsConfigurationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @Autowired
    private LimitsConfigurationServiceImpl limitsConfigurationService;

    @GetMapping("/limits")
    @HystrixCommand(fallbackMethod="fallbackRetrieveDefaultLimit")
    public LimitConfigurationBean retrieveLimitFromConfigurations(){
        return limitsConfigurationService.getLimits();
    }

    @GetMapping("/fault-tolerance-example")
    @HystrixCommand(fallbackMethod="fallbackRetrieveConfiguration")
    public LimitConfigurationBean retrieveConfigurations(){
        throw new RuntimeException("Not Availabel");
    }

    public LimitConfigurationBean fallbackRetrieveConfiguration(){
        return new LimitConfigurationBean(0,1);
    }
    public LimitConfigurationBean fallbackRetrieveDefaultLimit(){
        return limitsConfigurationService.getDefaultsLimits();
    }
}
