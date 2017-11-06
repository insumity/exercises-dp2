package ch.epfl.sweng.dp2.solutions.ex8;

public class BoldText extends DocumentPart {

    public BoldText(String text) {
        super(text);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
