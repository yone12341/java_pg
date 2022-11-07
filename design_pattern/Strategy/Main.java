package design_pattern.Strategy;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        
        SearchApi sequence = new SearchApi(new SequentialStrategy());
        SearchApi binary = new SearchApi(new BinaryStrategy());

        int random = new Random().nextInt(10000)+1;
        System.out.println("乱数：" + random);

        Employee emp1 = sequence.searchStrategy(random);
        System.out.println(emp1);

        System.out.println();

        Employee emp2 = binary.searchStrategy(random);
        System.out.println(emp2);
    }
}
