package design_pattern.Template;

public class Main {
    public static void main(String args[]){
        AbstractDisplay disp1 = new CharDisplay('H');
        AbstractDisplay disp2 = new StringDisplay("Hello World");
        AbstractDisplay disp3 = new StringDisplay("こんにちは");
        disp1.display();
        disp2.display();
        disp3.display();
    }
}
