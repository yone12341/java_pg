package design_pattern.AbstractFactory;

public class ListFactory extends Factory{
    public Link createLink(String caption, String url){
        return new ListLink(caption, url);
    };
    public Tray createTray(String caption){
        return new ListTray(caption);
    };
    public Page createPage(String title, String caption){
        return new ListPage(title, caption);
    };
}
