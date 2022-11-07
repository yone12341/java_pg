package design_pattern.Strategy;

import java.util.ArrayList;
import java.util.List;

public class SearchApi {
    
    private Strategy strategy;

    private static List<Employee> employeeList = new ArrayList<>();

    static{
        for (int i = 0; i < 10000; i++){
            Employee employee = new Employee(i, "user_" + i);
            employeeList.add(employee);
        }
    }

    public SearchApi(Strategy strategy){
        this.strategy = strategy;
    }

    public Employee searchStrategy(int id){
        
        Employee employee = strategy.search(employeeList, id);
        return employee;
    }
}
