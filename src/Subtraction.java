import java.util.ArrayList;

public class Subtraction extends Expression{
    private ArrayList<Expression> terms;

    public Subtraction(Expression minuendo, Expression subtraendo) {
        this.terms = new ArrayList<>();
        this.terms .add(minuendo);
        this.terms.add(subtraendo);
    }

    @Override
    public double evaluate() {
        return terms.get(0).evaluate() - terms.get(1).evaluate();
    }
}
