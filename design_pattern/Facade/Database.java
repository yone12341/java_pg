package design_pattern.Facade;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Database {
    private Database(){
    }

    public static Properties getProperties(String dbName){

        String filaName = dbName + ".txt";
        Properties prop = new Properties();

        try{
            prop.load(new FileInputStream(filaName));
        }catch(IOException e){
            System.out.println("Warning " + filaName + " is not found");
        }
        return prop;
    }
}
