package design_pattern.Template;

public class StringDisplay extends AbstractDisplay {
    
    private int width;
    private String str;
    public StringDisplay(String str){
        this.str = str;
        this.width = str.length();
    }
    public void open(){
        printLine();
    }
    public void print(){
        System.out.println("|" + str + "|");
    }
    public void close(){
        printLine();
    }

    private void printLine(){
        System.out.print("+");
        for(int i = 0; i < width; i++){
            System.out.print("-");
        }
        System.out.println("+");
    }
}
