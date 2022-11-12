package design_pattern.Mediator;

import java.awt.*;
import java.awt.event.*;

public class ColleagueCheckbox extends Checkbox implements ItemListener, Colleague{

    private Mediator mediator;

    public ColleagueCheckbox(String caption, CheckboxGroup group, boolean state){
        super(caption,group,state);
    }

    @Override
    public void setMediaor(Mediator mediator) {
        this.mediator = mediator;
        
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
        
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        mediator.colleagueChanged();
        
    }
    
}
