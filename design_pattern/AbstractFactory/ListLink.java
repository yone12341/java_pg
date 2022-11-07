package design_pattern.AbstractFactory;

public class ListLink extends Link{
    public ListLink(String caption, String url){
        super(caption,url);
    }
    public String makeHTML(){
        return "<li><a href=\"" + url + "\">" + caption + "</li>";
    }
}
