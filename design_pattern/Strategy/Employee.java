package design_pattern.Strategy;

public class Employee {
    
    private int id;
    private String name;

    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String toString(){
        return "Employee[id:" + id + ",name:" + name + "]";
    }
}
