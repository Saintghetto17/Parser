package expression;

public abstract class AbstractClassExpression implements MergedExpression {
    public MergedExpression exp1;
    public MergedExpression exp2;
    private final String string;

    protected AbstractClassExpression(String string, MergedExpression exp1, MergedExpression exp2) {
        this.string = string;
        this.exp1 = exp1;
        this.exp2 = exp2;
    }
    private int operator (String string, int v1, int v2) {
        if (string.equals("*")) {
            return v1 * v2;
        }
        else if (string.equals("-")) {
            return v1 - v2;
        }
        else if (string.equals("+")) {
            return v1 + v2;
        }
        else if (string.equals("/")) {
            return v1 / v2;
        }
        throw new AssertionError("this operation is not supported");
    }
    public int evaluate(int var) {
        return operator(this.string, exp1.evaluate(var),exp2.evaluate(var));
    }
    public String toString() {
        return '(' + exp1.toString() + " " + string + " " + exp2.toString() + ')' ;
    }
    public int hashCode() {
        return exp1.hashCode()*239 + exp2.hashCode()*23 + string.hashCode()*19;
    }

    public boolean equals(Object obj) {
        if (obj instanceof  AbstractClassExpression that) {
            return this.exp1.equals(that.exp1) && this.exp2.equals(that.exp2) &&
                    that.getClass().equals(this.getClass());
        }
        return false;
    }
    public int evaluate(int x, int y, int z) {
        return operator (this.string, exp1.evaluate(x, y, z),exp2.evaluate(x, y, z));
    }
}
