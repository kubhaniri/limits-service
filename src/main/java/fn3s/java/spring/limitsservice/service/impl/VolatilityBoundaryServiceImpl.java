package fn3s.java.spring.limitsservice.service.impl;

import fn3s.java.spring.limitsservice.bean.VolatilityBoundaryBean;
import fn3s.java.spring.limitsservice.repositories.VolatilityBoundaryRepository;
import fn3s.java.spring.limitsservice.service.VolatilityBoundaryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VolatilityBoundaryServiceImpl implements VolatilityBoundaryService {
    private Logger log = LoggerFactory.getLogger(this.getClass());
    @Autowired
    VolatilityBoundaryRepository volatilityBoundaryRepository;

    @Override
    public VolatilityBoundaryBean getVolatilityBoundary(String Currency) {
        log.info("getVolatilityBoundary Currency: {}, {}", Currency, this.getClass().getMethods());
        return volatilityBoundaryRepository.findByCurrency(Currency);
    }
}
