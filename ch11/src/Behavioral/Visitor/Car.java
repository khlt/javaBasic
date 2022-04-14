package Behavioral.Visitor;

public interface Car {
    int drive();

    int getFuel();

    String visit(ViewVisitor viewVisitor);
}