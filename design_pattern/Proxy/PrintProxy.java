package design_pattern.Proxy;

public class PrintProxy implements Printable{
    private String name;
    private Printer real;
    public PrintProxy(){
        
    }
    public PrintProxy(String name){
        this.name = name;
    }
    @Override
    public void setPrinterName(String name) {
        if(real != null) {
            real.setPrinterName(name);
        }
        this.name = name;        
    }
    @Override
    public String getPrinterName() {
        return name;
    }
    @Override
    public void print(String str) {
        realize();
        real.print(str);
    }

    private synchronized void realize(){
        if(real == null){
            real = new Printer(name);
        }
    }
}
