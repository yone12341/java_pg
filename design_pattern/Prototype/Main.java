package design_pattern.Prototype;

public class Main {
    public static void main(String[] args){
        Manager manager = new Manager();
        UnderLinePen uPen = new UnderLinePen('-');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');

        manager.register("Strong box", uPen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        Product p1 = manager.createProduct("Strong box");
        p1.use("Hello World");
        Product p2 = manager.createProduct("warning box");
        p2.use("Hello World");
        Product p3 = manager.createProduct("slash box");
        p3.use("Hello World");
    }
}
