package design_pattern.Builder;

public class Main {
    public static void main(String[] args){
        if(args.length != 1){
            usage();
            System.exit(0);
        }

        if(args[0].equals("plain")){
            TextBuilder textbuilder = new TextBuilder();
            Director director = new Director(textbuilder);
            director.construct();
            String result = textbuilder.getResult();
            System.out.println(result);
        }else if(args[0].equals("html")){
            HtmlBuilder htmlBuilder = new HtmlBuilder();
            Director director = new Director(htmlBuilder);
            director.construct();
            String fileName = htmlBuilder.getResult();
            System.out.println(fileName + "が作成されました。");
        }else{
            usage();
            System.exit(0);
        }

    }

    public static void usage(){
        System.out.println("java Main plain プレーンテキストで文書作成");
        System.out.println("java Main html HTMLファイルで文書作成");
    }
}
