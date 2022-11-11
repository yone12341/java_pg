package design_pattern.Visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Department extends Unit{
    
    private String name;

    private List<Unit> unitList = new ArrayList<>();

    public Department(String name) {
        super();
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public Unit add(Unit unit){
        unitList.add(unit);
        return this;
    }

    public Iterator<Unit> iterator(){
        return unitList.iterator();
    }

    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}
