package fn3s.java.spring.limitsservice.bean;

public class LimitConfigurationBean {
    private int maximun;
    private int minimum;

    public LimitConfigurationBean(int maximun, int minimum) {
        this.maximun = maximun;
        this.minimum = minimum;
    }

    public LimitConfigurationBean() {
    }

    public int getMaximun() {
        return maximun;
    }

    public int getMinimum() {
        return minimum;
    }
}
