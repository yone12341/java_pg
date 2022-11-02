package design_pattern.Prototype;

import java.util.HashMap;

public class Manager {

    private HashMap<String,Product> showCase = new HashMap<>();
    public void register(String name, Product proto){
        showCase.put(name,proto);
    }
    public Product createProduct(String protoName){
        Product p = showCase.get(protoName);
        return p.createClone();
    }
}
