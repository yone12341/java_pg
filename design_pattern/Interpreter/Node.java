package design_pattern.Interpreter;

public abstract class Node {
    public abstract Object parse(Context context) throws JsonParseException;
}
