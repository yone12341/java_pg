package design_pattern.Decorator;

public abstract class Border extends Display{
    public Display display;
    public Border(Display display){
        this.display = display;
    }
}
