package expression;
public class Subtract extends AbstractClassExpression {
    public Subtract (MergedExpression exp1, MergedExpression exp2) {
        super ("-", exp1, exp2);
    }
}
