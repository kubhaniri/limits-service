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
    private LimitsConfigurationServiceImpl limitsConfigurationService;

    @GetMapping("/volatility-boundary/currencyfrom/{currencyfrom}/currencyto/{currencyto}")
    public VolatilityBoundaryBean getVolatilityBoundary(
            @PathVariable String currencyfrom,
            @PathVariable String currencyto
    ){
        if(validateCurrency(currencyfrom, currencyto)) {
            return volatilityBoundaryService.getVolatilityBoundary(currencyfrom,  currencyto);
        }else{
            return new VolatilityBoundaryBean(currencyfrom, currencyto, BigDecimal.ZERO, BigDecimal.ZERO, new Date(), 0);
        }
    }

    private boolean validateCurrency(String currencyfrom, String currencyto) {
        List<String> listOfCurrencies = limitsConfigurationService.loadCurrencies();
        return null!= currencyto ? (listOfCurrencies.contains(currencyfrom) && listOfCurrencies.contains(currencyto)): listOfCurrencies.contains(currencyfrom);
    }
}
