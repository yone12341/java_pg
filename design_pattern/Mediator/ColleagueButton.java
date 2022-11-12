package design_pattern.Mediator;

import java.awt.Button;

public class ColleagueButton extends Button implements Colleague{

    private Mediator mediator;

    public ColleagueButton(String caption){
        super(caption);
    }
    @Override
    public void setMediaor(Mediator mediator) {
        this.mediator = mediator;
        
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }
    
}
