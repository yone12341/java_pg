package design_pattern.Visitor;

public class Main {
    public static void main(String[] args) {
        
        try{
            Unit dept1 = new Department("営業1部");
            Unit group1_1 = new Group("1課");
            Unit group1_2 = new Group("2課");
            dept1.add(group1_1);
            dept1.add(group1_2);
    
            Unit dept2 = new Department("営業2部");
            Unit group2_1 = new Group("1課");
            Unit group2_2 = new Group("2課");
            dept2.add(group2_1);
            dept2.add(group2_2);
    
            Unit dept3 = new Department("営業部");
            dept3.add(dept1);
            dept3.add(dept2);
    
            dept3.accept(new ListVisitor());
    
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
