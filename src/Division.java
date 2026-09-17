import java.util.ArrayList;

public class Division extends Expression{
    private ArrayList<Expression> divisors;

    public Division(Expression dividendo, Expression divisor) {
        this.divisors = new ArrayList<>();
        this.divisors.add(dividendo);
        this.divisors.add(divisor);
    }

    @Override
    public double evaluate() {
        return divisors.get(0).evaluate() / divisors.get(1).evaluate();
    }
}
