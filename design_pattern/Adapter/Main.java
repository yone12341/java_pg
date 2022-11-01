package design_pattern.Adapter;

public class Main {
    public static void main(String[] args){
        PrintBanner printBanner = new PrintBanner("Hello");
        printBanner.printWeek();
        printBanner.printStrong();

        PrintBanner2 printBanner2 = new PrintBanner2("Hello");
        printBanner2.printWeek();
        printBanner2.printStrong();

    }
}
