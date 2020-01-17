package fn3s.java.spring.limitsservice.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class VolatilityBoundaryBean {
    @Id
    private String currency;
    private BigDecimal minBounded;
    private BigDecimal maxBounded;
    private Date dateInsertion;

    public VolatilityBoundaryBean() {}

    public VolatilityBoundaryBean(String currency, BigDecimal minBounded, BigDecimal maxBounded, Date dateInsertion) {
        this.currency = currency;
        this.minBounded = minBounded;
        this.maxBounded = maxBounded;
        this.dateInsertion = dateInsertion;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getMinBounded() {
        return minBounded;
    }

    public void setMinBounded(BigDecimal minBounded) {
        this.minBounded = minBounded;
    }

    public BigDecimal getMaxBounded() {
        return maxBounded;
    }

    public void setMaxBounded(BigDecimal maxBounded) {
        this.maxBounded = maxBounded;
    }

    public Date getDateInsertion() {
        return dateInsertion;
    }

    public void setDateInsertion(Date dateInsertion) {
        this.dateInsertion = dateInsertion;
    }
}
