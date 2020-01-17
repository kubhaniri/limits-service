package fn3s.java.spring.limitsservice.controllers;

import fn3s.java.spring.limitsservice.bean.VolatilityBoundaryBean;
import fn3s.java.spring.limitsservice.service.VolatilityBoundaryService;
import fn3s.java.spring.limitsservice.service.impl.VolatilityBoundaryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Date;

@RestController
public class VolatilityBoundaryController {

    @Autowired
    private VolatilityBoundaryServiceImpl volatilityBoundaryService;

    @GetMapping("/volatility-boundary/currency/{currency}")
    public VolatilityBoundaryBean getVolatilityBoundary( @PathVariable String currency){
        if(validateCurrency(currency)) {
            return volatilityBoundaryService.getVolatilityBoundary(currency);
        }else{
            return new VolatilityBoundaryBean(currency, BigDecimal.ZERO, BigDecimal.ZERO, new Date());
        }
    }

    private boolean validateCurrency(String currency) {
        return true;
    }
}
