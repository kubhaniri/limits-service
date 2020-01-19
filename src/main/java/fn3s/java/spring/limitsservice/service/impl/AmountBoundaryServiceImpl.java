package fn3s.java.spring.limitsservice.service.impl;

import fn3s.java.spring.limitsservice.bean.AmountBoundaryBean;
import fn3s.java.spring.limitsservice.repositories.AmountBoundaryRepository;
import fn3s.java.spring.limitsservice.service.AmountBoundaryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AmountBoundaryServiceImpl implements AmountBoundaryService {
    private Logger log = LoggerFactory.getLogger(this.getClass());
    @Autowired
    AmountBoundaryRepository amountBoundaryRepository;

    @Override
    public AmountBoundaryBean getAmountBoundary(String currency) {
        log.info("getAmountBoundary currency: {}, {}", currency, this.getClass().getMethods());
        return amountBoundaryRepository.findByCurrency(currency);
    }
}
