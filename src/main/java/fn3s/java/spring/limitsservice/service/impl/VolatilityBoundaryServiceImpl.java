package fn3s.java.spring.limitsservice.service.impl;

import fn3s.java.spring.limitsservice.bean.VolatilityBoundaryBean;
import fn3s.java.spring.limitsservice.repositories.VolatilityBoundaryRepository;
import fn3s.java.spring.limitsservice.service.VolatilityBoundaryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class VolatilityBoundaryServiceImpl implements VolatilityBoundaryService {
    private Logger log = LoggerFactory.getLogger(this.getClass());
    @Autowired
    VolatilityBoundaryRepository volatilityBoundaryRepository;
    @Autowired
    private Environment environment;

    @Override
    public VolatilityBoundaryBean getVolatilityBoundary(String CurrencyFrom, String CurrencyTo) {
        VolatilityBoundaryBean byCurrencyFromAndAndCurrencyTo = volatilityBoundaryRepository.findByCurrencyFromAndAndCurrencyTo(CurrencyFrom, CurrencyTo);
        byCurrencyFromAndAndCurrencyTo.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
        log.info("getVolatilityBoundary CurrencyFrom: {},CurrencyTo: {}, VolatilityBoundaryBean {}", CurrencyFrom, byCurrencyFromAndAndCurrencyTo);
        return volatilityBoundaryRepository.findByCurrencyFromAndAndCurrencyTo(CurrencyFrom, CurrencyTo);
    }
}
