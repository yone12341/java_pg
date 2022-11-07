package design_pattern.AbstractFactory;

import java.util.*;
public abstract class Tray extends Item {
    public ArrayList<Item> tray = new ArrayList<>();
    public Tray(String caption){
        super(caption);
    }
    public void add (Item item){
        tray.add(item);
    }
}
