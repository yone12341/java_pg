package design_pattern.Adapter;

public class PrintBanner2 implements Print {
    private Banner banner;
    public PrintBanner2(String str){
        this.banner = new Banner(str);
    }
    public void printWeek(){
        banner.showWithParen();
    }
    public void printStrong(){
        banner.showWithAster();
    }
}
