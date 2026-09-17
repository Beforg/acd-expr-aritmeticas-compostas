import java.util.ArrayList;
import java.util.Arrays;

public class Multiplication extends Expression{
    private ArrayList<Expression> factors;

    public Multiplication(Expression... exprs) {
        this.factors = new ArrayList<>(Arrays.asList(exprs));
    }

    @Override
    public double evaluate() {
        if (factors.isEmpty()) return 0;

        double total = 1;
        for (Expression e : factors) {
            total *= e.evaluate();
        }
        return total;
    }
}
