package expression;
public class Multiply extends AbstractClassExpression {
    public Multiply (MergedExpression exp1, MergedExpression exp2) {
       super("*",exp1,exp2);
    }
}
