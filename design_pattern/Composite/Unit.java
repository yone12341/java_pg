package design_pattern.Composite;

public abstract class Unit {
    
    public abstract String getName();

    public abstract void printList(String prefix);

    public void add(Unit unit){};

    public String toString(){
        return getName();
    }
}
