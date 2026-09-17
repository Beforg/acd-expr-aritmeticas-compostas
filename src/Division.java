import java.util.ArrayList;

public class Division extends Expression{
    private ArrayList<Expression> divisors;

    public Division() {
        this.divisors = new ArrayList<>();
    }

    public void addDivisor(Expression divisor) {
        this.divisors.add(divisor);
    }

    @Override
    public double evaluate() {
        if (divisors.isEmpty()) {
            return 1;
        }
        double quotient = divisors.getFirst().evaluate();
        for (int i = 1; i < divisors.size(); i++) {
            quotient /= divisors.get(i).evaluate();
        }
        return quotient;
    }
}
