package ch.epfl.sweng.dp2.ex8;

public class PlainText extends DocumentPart {

    public PlainText(String text) {
        super(text);
    }

    @Override
    public String toHTML() {
        return getText();
    }

    @Override
    public String toPlainText() {
        return getText();
    }

}
