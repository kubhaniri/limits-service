package fn3s.java.spring.limitsservice.service.impl;

import fn3s.java.spring.limitsservice.config.Configuration;
import fn3s.java.spring.limitsservice.service.LimitsConfigurationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class LimitsConfigurationServiceImpl implements LimitsConfigurationService {
    private Logger log = LoggerFactory.getLogger(this.getClass());
    @Autowired
    Configuration configuration;

    @Override
    public List<String> loadCurrencies() {
        String listCurrencies = configuration.getListOfCurrencies();
        log.info("loadCurrencies listCurrencies: {}, {}", listCurrencies, this.getClass().getMethods());
        String[] listOfCurrencies = listCurrencies.split(",");
        return Arrays.asList(listOfCurrencies);
    }
}
