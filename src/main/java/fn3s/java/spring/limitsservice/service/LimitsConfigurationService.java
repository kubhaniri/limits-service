package fn3s.java.spring.limitsservice.service;

import fn3s.java.spring.limitsservice.bean.LimitConfigurationBean;

import java.util.List;

public interface LimitsConfigurationService {
    LimitConfigurationBean getLimits();
    List<String> loadCurrencies();
    LimitConfigurationBean getDefaultsLimits();

}
