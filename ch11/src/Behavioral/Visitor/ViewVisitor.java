package Behavioral.Visitor;

public interface ViewVisitor {
    String visit(Bus bus);
    String visit(Truck truck);
}