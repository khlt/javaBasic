package Behavioral.Visitor;

public class Bus implements Car {
    private int fuel;

    Bus(final int fuel) {
        this.fuel = fuel;
    }

    @Override
    public int drive() {
        return --fuel;
    }

    @Override
    public int getFuel() {
        return fuel;
    }

    @Override
    public String visit(final ViewVisitor viewVisitor) {
        return viewVisitor.visit(this);
    }
}
