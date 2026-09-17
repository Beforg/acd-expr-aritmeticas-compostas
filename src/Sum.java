import java.util.ArrayList;
import java.util.Arrays;

public class Sum extends Expression{
    private ArrayList<Expression> terms;

    public Sum(Expression... exprs) {
        this.terms = new ArrayList<>(Arrays.asList(exprs));
    }

    public void addTerm(Expression term) {
        this.terms.add(term);
    }

    @Override
    public double evaluate() {
        if (terms.isEmpty()) return 0;
        double sum = 0;
        for (Expression term : terms) {
            sum += term.evaluate();
        }
        return sum;
    }
}
