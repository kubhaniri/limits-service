package fn3s.java.spring.limitsservice.service;

import fn3s.java.spring.limitsservice.bean.VolatilityBoundaryBean;

public interface VolatilityBoundaryService {

    VolatilityBoundaryBean getVolatilityBoundary(String Currency);
}
