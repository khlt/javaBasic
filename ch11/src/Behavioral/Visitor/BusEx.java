package Behavioral.Visitor;

public class BusEx {

    public static void main(String[] args) {
        /* Given */
        Bus bus = new Bus(10);
        /* When */
        bus.drive();
        /* Then */
        System.out.println(bus.getFuel());
        System.out.println(bus.visit(new CarViewVisitor()));
    }
}
