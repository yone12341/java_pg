package design_pattern.Singleton;

public class Main {
    public static void main(String[] args){
        System.out.println("Start...");

        Singleton obj1 = Singleton.getInstanse();
        Singleton obj2 = Singleton.getInstanse();

        if(obj1 == obj2) {
            System.out.println("obj1とobj2は同じインスタンスです");
        } else {
            System.out.println("obj1とobj2は違うインスタンスです");
        }
        System.out.println("End...");

    }
}
