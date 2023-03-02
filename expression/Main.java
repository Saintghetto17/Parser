package expression;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
    //int x = Integer.parseInt(args[0]);
        System.out.println((new Add(new Subtract(new Multiply(new Variable("x"),new Variable("x")),
                new Multiply(new Const(2),new Variable("x"))),new Const(1))).evaluate(1));
        //MergedExpression exp1 = new Add(new Variable("x"),new Variable("x"));
        //MergedExpression exp2 = new Add(new Variable("x"),new Variable("y"));
        System.out.println((new Subtract(new Const(1), new Subtract(new Const(2),new Const(3)))).toString());
        System.out.println((new Subtract(new Const(1), new Subtract(new Const(2),new Const(3)))).hashCode());
        System.out.println((new Add(new Const(1),new Divide(new Const(2),new Const(3)))));
        System.out.println((new Add(new Const(1),new Divide(new Const(2),new Const(3)))).hashCode());
    }
}
