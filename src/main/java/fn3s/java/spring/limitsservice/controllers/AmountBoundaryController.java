package fn3s.java.spring.limitsservice.controllers;

import fn3s.java.spring.limitsservice.bean.AmountBoundaryBean;
import fn3s.java.spring.limitsservice.service.impl.AmountBoundaryServiceImpl;
import fn3s.java.spring.limitsservice.service.impl.LimitsConfigurationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@RestController
public class AmountBoundaryController {
    @Autowired
    private AmountBoundaryServiceImpl amountBoundaryService;
    @Autowired
    private LimitsConfigurationServiceImpl limitsConfigurationService;

    @GetMapping("/amount-boundary/currency/{currency}")
    public AmountBoundaryBean getAmountBoundary(@PathVariable String currency){
        if(validateCurrency(currency)) {
            return amountBoundaryService.getAmountBoundary(currency);
        }else{
            return new AmountBoundaryBean(currency, BigDecimal.ZERO, BigDecimal.ZERO, new Date());
        }
    }

    private boolean validateCurrency(String currency) {
        List<String> listOfCurrencies = limitsConfigurationService.loadCurrencies();
        return listOfCurrencies.contains(currency);
    }
}
