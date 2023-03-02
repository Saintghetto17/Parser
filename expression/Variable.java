package expression;

import java.util.Objects;

public class Variable implements MergedExpression {
    private final String string;
    public Variable (String string) {
        this.string = string;
    }
    public String getString() {
        return this.string;
    }


    public int evaluate(int var) {
        return var;
    }
    public int evaluate (int x, int y, int z) {
        if (string.equals("x")) {
            return x;
        }
        else if (string.equals("y")) {
            return y;
        }
        else if (string.equals("z")) {
            return z;
        }
        throw new AssertionError("this can not happen");
    }
    @Override
    public String toString() {
        return string;
    }

    @Override
    public int hashCode() {
        return string.hashCode();
    }



    @Override
    public boolean equals(Object exp) {
        if (exp instanceof Variable) {
            Variable that = (Variable) exp;
            return this.string.equals(that.string);
        }
        else {
            return false;
        }
    }
}
