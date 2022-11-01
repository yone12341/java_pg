package design_pattern.Adapter;

public class PrintBanner extends Banner implements Print {
    
    public PrintBanner(String str){
        super(str);
    }
    public void printWeek(){
        showWithParen();
    }
    public void printStrong(){
        showWithAster();
    }
}
