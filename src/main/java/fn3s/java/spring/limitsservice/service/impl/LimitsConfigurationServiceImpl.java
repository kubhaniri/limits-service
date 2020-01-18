package fn3s.java.spring.limitsservice.service.impl;

import fn3s.java.spring.limitsservice.config.Configuration;
import fn3s.java.spring.limitsservice.service.LimitsConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class LimitsConfigurationServiceImpl implements LimitsConfigurationService {
    @Autowired
    Configuration configuration;

    @Override
    public List<String> loadCurrencies() {
        String listCurrencies = configuration.getListOfCurrencies();
        String[] listOfCurrencies = listCurrencies.split(",");
        return Arrays.asList(listOfCurrencies);
    }
}
