package design_pattern.Proxy;

public class Printer implements Printable{
    private String name;
    public Printer(){
        heavyJob("Printerのインスタンスを生成中");
    }
    public Printer(String name){
        this.name = name;
        heavyJob("Printerのインスタンス（" + name + "）を生成中");
    }
    public void setPrinterName(String name){
        this.name = name;
    }
    public String getPrinterName(){
        return name;
    }
    public void print(String str){
        System.out.println("===" + name + "===");
        System.out.println(str);
    }
    private void heavyJob(String str) {
        System.out.println(str);
        try {
            Thread.sleep(5000);
        } catch(InterruptedException e) {

        }

        System.out.println("完了");
    }
}
