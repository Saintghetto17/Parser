package expression;
public class Divide extends AbstractClassExpression {

    public Divide (MergedExpression exp1, MergedExpression exp2) {
        super("/",exp1,exp2);
    }
}
