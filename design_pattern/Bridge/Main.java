package design_pattern.Bridge;

public class Main {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("AAA"));
        Display d2 = new CountDisplay(new StringDisplayImpl("BBB"));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("CCCCC"));

        d1.display();
        d2.display();
        d3.display();

        d3.multiDisplay(5);
    }
}
