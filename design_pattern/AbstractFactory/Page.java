package design_pattern.AbstractFactory;

import java.util.*;
import java.io.*;

public abstract class Page {
    public String title;
    public String author;
    public ArrayList<Item> content = new ArrayList<>();

    public Page(String title, String author){
        this.title = title;
        this.author = author;
    }

    public void add(Item item){
        content.add(item);
    }

    public void output(){
        try {
            String fileName = title + ".html";
            Writer writer = new FileWriter(fileName);
            writer.write(this.makeHTML());
            writer.close();
            System.out.println(fileName + "を作成しました。");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public abstract String makeHTML();

}
