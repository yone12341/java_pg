package design_pattern.Singleton;

public class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton(){
        System.out.println("インスタンス生成しました");
    }

    public static Singleton getInstanse(){
        return singleton;
    }
}
