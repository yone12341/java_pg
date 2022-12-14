package design_pattern.Interpreter;

public class Employee {
    
    private String name;
    private Integer age;
    private String prefecture;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public String getPrefecture() {
        return prefecture;
    }
    public void setPrefecture(String prefecture) {
        this.prefecture = prefecture;
    }
    
    public String toString() {
        return "Employee[name=" + name
            + ",age=" + age
            + ",prefecture=" + prefecture + "]";
    }
}
