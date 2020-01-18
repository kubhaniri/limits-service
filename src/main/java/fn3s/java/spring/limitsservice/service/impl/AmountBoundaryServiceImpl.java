package fn3s.java.spring.limitsservice.service.impl;

import fn3s.java.spring.limitsservice.bean.AmountBoundaryBean;
import fn3s.java.spring.limitsservice.repositories.AmountBoundaryRepository;
import fn3s.java.spring.limitsservice.service.AmountBoundaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AmountBoundaryServiceImpl implements AmountBoundaryService {

    @Autowired
    AmountBoundaryRepository amountBoundaryRepository;

    @Override
    public AmountBoundaryBean getAmountBoundary(String currency) {
        return amountBoundaryRepository.findByCurrency(currency);
    }
}
