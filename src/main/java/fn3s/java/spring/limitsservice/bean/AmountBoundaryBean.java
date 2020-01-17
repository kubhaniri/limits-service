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

    public AmountBoundaryBean() {
    }

    public AmountBoundaryBean(String currency, BigDecimal minAmount, BigDecimal maxAmount, Date dateInsertion) {
        this.currency = currency;
        this.minAmount = minAmount;
        this.maxAmount = maxAmount;
        this.dateInsertion = dateInsertion;
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
}
