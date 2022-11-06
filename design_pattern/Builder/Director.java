package design_pattern.Builder;

public class Director {
    private Builder builder;
    public Director(Builder builder){
        this.builder = builder;
    }
    public void construct(){
        builder.makeTitle("Greeting");
        builder.makeString("朝から昼にかけて");
        builder.makeItem(new String[]{
            "おはようございます",
            "こんにちは"
        });
        builder.makeString("夜に");
        builder.makeItem(new String[]{
            "こんばんは",
            "おやすみなさい",
            "さようなら"
        });
        builder.close();
    }
}
