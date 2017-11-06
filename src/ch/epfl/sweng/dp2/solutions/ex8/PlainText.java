package ch.epfl.sweng.dp2.solutions.ex8;

public class PlainText extends DocumentPart {

    public PlainText(String text) {
        super(text);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
