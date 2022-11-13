package design_pattern.State;

import java.util.Date;

public class Shop {

    private Date date;

    private WeekState state = WeekdaysState.getInstance();

    public Date getDate(){
        return this.date;
    }

    public void setDate(Date date){
        this.date = date;
        state.setDate(this);
    }

    public void changeState(WeekState state){
        this.state = state;
    }

    public void open(){
        state.open(this.date);
    }

    public void close(){
        state.close(this.date);
    }
}
