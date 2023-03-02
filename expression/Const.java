package expression;
public class Const implements MergedExpression {
     private final int x;
     public Const (int x) {
         this.x = x;
     }

    public int getX() {
        return x;
    }
    public int evaluate (int x, int y, int z) {
         return this.x;
    }

    @Override
    public int evaluate(int var) {
        return this.x;
    }
    @Override
    public String toString() {
        return Integer.toString(this.x);
    }
    public int hashCode() {
         return Integer.hashCode(x);
    }
    public boolean equals(Object exp) {
        if (exp instanceof Const) {
            Const that = (Const) exp;
            return this.x == that.x;
        }
        else {
            return false;
        }
    }
}
