package design_pattern.Visitor;

public class Group extends Unit{
    
    private String name;

    public Group(String name){
        super();
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void accept(Visitor visitor){
        visitor.visit(this);
    }

    public void printList(String prefix){
        System.out.println(prefix + "/" + this);
    }
    
}
