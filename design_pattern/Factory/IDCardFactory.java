package design_pattern.Factory;

import java.util.*;

public class IDCardFactory extends Factory{
    
    private List<String> owners = new ArrayList<>();
    public Product createProduct(String owner){
        return new IDCard(owner);
    }
    public void registerProduct(Product product){
        owners.add(((IDCard)product).getOwner());
    }
    public List<String> getOwners(){
        return owners;
    }
}
