package fn3s.java.spring.limitsservice.service;

import fn3s.java.spring.limitsservice.bean.VolatilityBoundaryBean;

import java.util.List;

public interface VolatilityBoundaryService {

    VolatilityBoundaryBean getVolatilityBoundary(String Currency);
    List<String> loadCurrencies();
}
