package design_pattern.Visitor;

import java.util.Iterator;

public abstract class Unit implements Element{
    
    public abstract String getName();

    public Unit add(Unit unit)throws Exception{
        throw new Exception();
    }

    public Iterator<Unit> Iterator()throws Exception{
        throw new Exception();
    }

    public String toString(){
        return getName();
    }
}
