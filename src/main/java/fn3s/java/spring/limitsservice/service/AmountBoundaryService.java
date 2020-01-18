package fn3s.java.spring.limitsservice.service;

import fn3s.java.spring.limitsservice.bean.AmountBoundaryBean;

public interface AmountBoundaryService  {
    AmountBoundaryBean getAmountBoundary(String currency);
}
