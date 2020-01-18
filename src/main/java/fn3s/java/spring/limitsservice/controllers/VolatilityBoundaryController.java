package fn3s.java.spring.limitsservice.controllers;

import fn3s.java.spring.limitsservice.bean.VolatilityBoundaryBean;
import fn3s.java.spring.limitsservice.service.impl.LimitsConfigurationServiceImpl;
import fn3s.java.spring.limitsservice.service.impl.VolatilityBoundaryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@RestController
public class VolatilityBoundaryController {

    @Autowired
    private VolatilityBoundaryServiceImpl volatilityBoundaryService;
    @Autowired
    LimitsConfigurationServiceImpl limitsConfigurationService;

    @GetMapping("/volatility-boundary/currency/{currency}")
    public VolatilityBoundaryBean getVolatilityBoundary( @PathVariable String currency){
        if(validateCurrency(currency)) {
            return volatilityBoundaryService.getVolatilityBoundary(currency);
        }else{
            return new VolatilityBoundaryBean(currency, BigDecimal.ZERO, BigDecimal.ZERO, new Date());
        }
    }

    private boolean validateCurrency(String currency) {
        List<String> listOfCurrencies = limitsConfigurationService.loadCurrencies();
        return listOfCurrencies.contains(currency);
    }
}
