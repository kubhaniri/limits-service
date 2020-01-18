package fn3s.java.spring.limitsservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties("limits-service")
public class Configuration {
    private int minimum;
    private int maximum;
    private String listOfCurrencies;

    public int getMinimum() {
        return minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public String getListOfCurrencies() {
        return listOfCurrencies;
    }

    public void setListOfCurrencies(String listOfCurrencies) {
        this.listOfCurrencies = listOfCurrencies;
    }
}
