package fn3s.java.spring.limitsservice.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class AmountBoundaryBean {
    @Id
    private String currency;
    private BigDecimal minAmount;
    private BigDecimal maxAmount;
    private Date dateInsertion;
    private int port;

    public AmountBoundaryBean() {
    }

    public AmountBoundaryBean(String currency, BigDecimal minAmount, BigDecimal maxAmount, Date dateInsertion, int port) {
        this.currency = currency;
        this.minAmount = minAmount;
        this.maxAmount = maxAmount;
        this.dateInsertion = dateInsertion;
        this.port = port;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(BigDecimal minAmount) {
        this.minAmount = minAmount;
    }

    public BigDecimal getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(BigDecimal maxAmount) {
        this.maxAmount = maxAmount;
    }

    public Date getDateInsertion() {
        return dateInsertion;
    }

    public void setDateInsertion(Date dateInsertion) {
        this.dateInsertion = dateInsertion;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "AmountBoundaryBean{" +
                "currency='" + currency + '\'' +
                ", minAmount=" + minAmount +
                ", maxAmount=" + maxAmount +
                ", dateInsertion=" + dateInsertion +
                ", port=" + port +
                '}';
    }
}
