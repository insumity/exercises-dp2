package ch.epfl.sweng.dp2.solutions.ex3;

public abstract class Shape {
    public abstract void color(String color);
    public void add(Shape shape) {
        throw new UnsupportedOperationException("This operation is not supported!");
    }
}
