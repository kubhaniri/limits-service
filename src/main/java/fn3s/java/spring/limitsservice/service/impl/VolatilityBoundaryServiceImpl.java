package fn3s.java.spring.limitsservice.service.impl;

import fn3s.java.spring.limitsservice.bean.VolatilityBoundaryBean;
import fn3s.java.spring.limitsservice.repositories.VolatilityBoundaryRepository;
import fn3s.java.spring.limitsservice.service.VolatilityBoundaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VolatilityBoundaryServiceImpl implements VolatilityBoundaryService {

    @Autowired
    VolatilityBoundaryRepository volatilityBoundaryRepository;

    @Override
    public VolatilityBoundaryBean getVolatilityBoundary(String Currency) {
        return volatilityBoundaryRepository.findByCurrency(Currency);
    }
}
