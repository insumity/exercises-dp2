package ch.epfl.sweng.dp2.ex3;

public class Main {

    public static void main(String[] args) {

        // TODO: Augment the Shape class if needed and introduce a ShapeComposite class

        Circle c = new Circle();
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();

        c.color("blue");
        r.color("red");
        t.color("pink");

//        Shape innerShape = new ShapeComposite();
//        innerShape.add(new Triangle());
//        innerShape.add(new Triangle());
//
//        Shape shape = new ShapeComposite();
//        shape.add(new Circle());
//        shape.add(new Rectangle());
//        shape.add(innerShape);
//
//        shape.color("black");
    }
}
