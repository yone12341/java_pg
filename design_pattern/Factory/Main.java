package design_pattern.Factory;

public class Main {
    
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("onamae1");
        Product card2 = factory.create("onamae2");
        Product card3 = factory.create("onamae3");

        card1.use();
        card2.use();
        card3.use();
    }
}
