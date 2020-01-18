package fn3s.java.spring.limitsservice.service.impl;

import fn3s.java.spring.limitsservice.bean.VolatilityBoundaryBean;
import fn3s.java.spring.limitsservice.config.Configuration;
import fn3s.java.spring.limitsservice.repositories.VolatilityBoundaryRepository;
import fn3s.java.spring.limitsservice.service.VolatilityBoundaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class VolatilityBoundaryServiceImpl implements VolatilityBoundaryService {

    @Autowired
    Configuration configuration;

    @Autowired
    VolatilityBoundaryRepository volatilityBoundaryRepository;



    @Override
    public VolatilityBoundaryBean getVolatilityBoundary(String Currency) {
        return volatilityBoundaryRepository.findByCurrency(Currency);
    }

    @Override
    public List<String> loadCurrencies() {
        String listCurrencies = configuration.getListOfCurrencies();
        String[] listOfCurrencies = listCurrencies.split(",");
        return Arrays.asList(listOfCurrencies);
    }
}
