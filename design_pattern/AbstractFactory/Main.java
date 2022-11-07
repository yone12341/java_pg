package design_pattern.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("Usage: java Main class.name.of.ConcreteFactory");
            System.out.println("Example:1 java Main listfactory.ListFactory");
            System.out.println("Example:1 java Main Tablefactory.TableFactory");
        }
        Factory factory = Factory.getFactory(args[1]);

        Link asahi = factory.createLink("朝日新聞", "http://www.asahi.com/");
        Link yomiuri = factory.createLink("読売新聞", "http://www.yomiuri.co.jp/");

        Link yahoo_us = factory.createLink("Yahoo!", "http://www.yahoo.com/");
        Link yahoo_jp = factory.createLink("Yahoo!Japan", "http://www.yahoo.co.jp/");
        Link excite = factory.createLink("Yahoo!Japan", "http://www.excite.com/");
        Link google = factory.createLink("Yahoo!Japan", "http://www.google.com/");

        Tray traynews = factory.createTray("新聞");
        traynews.add(asahi);
        traynews.add(yomiuri);

        Tray trayyahoo = factory.createTray("Yahoo");
        trayyahoo.add(yahoo_us);
        trayyahoo.add(yahoo_jp);

        Tray traysearch = factory.createTray("search");
        traysearch.add(trayyahoo);
        traysearch.add(excite);
        traysearch.add(google);

        Page page = factory.createPage("LinkPage", "yone");
        page.add(traynews);
        page.add(traysearch);
        page.output();
    }
}
