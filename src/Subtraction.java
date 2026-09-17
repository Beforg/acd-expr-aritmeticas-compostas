import java.util.ArrayList;

public class Subtraction extends Expression{
    private ArrayList<Expression> terms;

    public Subtraction() {
        this.terms = new ArrayList<>();
    }

    public void addTerm(Expression term) {
        this.terms.add(term);
    }

    @Override
    public double evaluate() {
        if (terms.isEmpty()) {
            return 0;
        }
        double sub = 0;
        for (Expression term : terms) {
            sub -= term.evaluate();
        }
        return sub;
    }
}
