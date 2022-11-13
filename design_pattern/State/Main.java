package design_pattern.State;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        
        Date date = new Date();

        Shop shop = new Shop();

        for(int i = 0; i < 7; i++){
            shop.setDate(date);

            shop.open();

            shop.close();

            date = addOneDay(date);
        }
    }

    private static Date addOneDay(Date date){
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);

        cal.add(Calendar.DATE,1);

        return cal.getTime();
    }
}
