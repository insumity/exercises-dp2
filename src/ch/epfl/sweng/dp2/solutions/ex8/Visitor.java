package ch.epfl.sweng.dp2.solutions.ex8;

public interface Visitor {
    void visit(PlainText part);
    void visit(BoldText part);
    void visit(HyperLink part);
}
