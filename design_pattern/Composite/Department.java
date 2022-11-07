package design_pattern.Composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Department extends Unit{
    
    private String name;

    private List<Unit> departmentList = new ArrayList<>();

    public Department(String name) {
        super();
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public void add(Unit unit){
        departmentList.add(unit);
    }

    public void printList(String prefix){
        System.out.println(prefix + " " + this);

        Iterator<Unit> it = departmentList.iterator();
        while(it.hasNext()){
            Unit unit = it.next();
            unit.printList(prefix + "/" +this.name);
        }
    }
}
