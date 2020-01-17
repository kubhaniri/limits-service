package fn3s.java.spring.limitsservice.bean;

public class LimitConfiguration {
    private int maximun;
    private int minimum;

    public LimitConfiguration(int maximun, int minimum) {
        this.maximun = maximun;
        this.minimum = minimum;
    }

    public LimitConfiguration() {
    }

    public int getMaximun() {
        return maximun;
    }

    public int getMinimum() {
        return minimum;
    }
}
