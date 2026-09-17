import java.util.ArrayList;

public class Sum extends Expression{
    private ArrayList<Expression> terms;

    public Sum() {
        this.terms = new ArrayList<>();
    }

    public void addTerm(Expression term) {
        this.terms.add(term);
    }

    @Override
    public double evaluate() {
        double sum = 0;
        for (Expression term : terms) {
            sum += term.evaluate();
        }
        return sum;
    }
}
