package fp_example.parser;

public class BooleanLiteralExp implements Exp {
    public final boolean value;

    public BooleanLiteralExp(final boolean value) {
        this.value = value;
    }

    public int hashCode() {
        return (value) ? 1 : 0;
    }

    public boolean equals(final Object other) {
        return (other instanceof BooleanLiteralExp &&
                value == ((BooleanLiteralExp)other).value);
    }

    public String toString() {
        return "BooleanLiteralExp(" + value + ")";
    }
}
