import java.util.ArrayList;

public class Multiplication extends Expression{
    private ArrayList<Expression> factors;

    public Multiplication() {
        this.factors = new ArrayList<>();
    }

    public void addFactor(Expression factor) {
        this.factors.add(factor);
    }

    @Override
    public double evaluate() {
        if (factors.isEmpty()) {
            return 1;
        }
        double product = 1;
        for (Expression factor : factors) {
            product *= factor.evaluate();
        }
        return product;
    }
}
