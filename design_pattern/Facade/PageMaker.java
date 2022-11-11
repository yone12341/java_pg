package design_pattern.Facade;

import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {
    private PageMaker(){
    }

    public static void makeWelcomePage(String mailaddr, String fileName){
        try{
            Properties mailprop = Database.getProperties("maildata");
            String userName = mailprop.getProperty(mailaddr);
            HtmlWriter writer = new HtmlWriter(new FileWriter(fileName));

            writer.title("Welcome to " + userName + " Page");
            writer.paragraph(userName + "のページへようこそ");
            writer.paragraph("メールお待ちしています。");
            writer.mailto(mailaddr, userName);
            writer.close();

            System.out.println(fileName + " is created for " + mailaddr + "(" + userName + ")");

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
