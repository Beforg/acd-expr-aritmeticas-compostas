public class Main {
    public static void main(String[] args) {
        // Teste das Expressões:
        // Expressão 1: 10 + 20 + 30
        Expression exp1 = new Sum(new Number(10), new Number(20), new Number(30));
        System.out.println("10 + 20 + 30 = " + exp1.evaluate());

        // Expressão 2: (10 + 20) * 5
        Expression exp2 = new Multiplication(
                new Sum(new Number(10), new Number(20)),
                new Number(5)
        );
        System.out.println("(10 + 20) * 5 = " + exp2.evaluate());

        // Expressão 3: (100 - 20) / (5 + 3)
        Expression exp3 = new Division(
                new Subtraction(new Number(100), new Number(20)),
                new Sum(new Number(5), new Number(3))
        );
        System.out.println("(100 - 20) / (5 + 3) = " + exp3.evaluate());

        // Expressão 4: ((10 + 20) * 5) - ((100 / 4) + 7)
        Expression exp4 = new Subtraction(
                new Multiplication(
                        new Sum(new Number(10), new Number(20)),
                        new Number(5)
                ),
                new Sum(
                        new Division(new Number(100), new Number(4)),
                        new Number(7)
                )
        );
        System.out.println("((10 + 20) * 5) - ((100 / 4) + 7) = " + exp4.evaluate());
    }
}