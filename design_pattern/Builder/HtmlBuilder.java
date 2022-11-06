package design_pattern.Builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HtmlBuilder extends Builder{
    private String filenane;
    private PrintWriter writer;

    public void makeTitle(String title){
        filenane = title + ".html";

        try {
            writer = new PrintWriter(new FileWriter(filenane));
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("<html><head><title>" + title + "</title></head></body>");
        writer.println(("<h1>>" + title + "</h1>"));

    }


    public void makeString(String str){
        writer.println("<p>" + str + "</p>");
    }

    public void makeItem(String[] items){
        writer.println("<ul>");
        for(int i = 0; i < items.length; i++){
            writer.println("<li>" + items[i] + "</li>");
        }
        writer.println("</ul>");
    }

    public void close(){
        writer.println("</body></html>");
        writer.close();
    }

    public String getResult(){
        return filenane;
    }
}
