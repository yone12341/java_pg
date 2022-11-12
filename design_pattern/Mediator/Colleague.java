package design_pattern.Mediator;

public interface Colleague {
    public abstract void setMediaor(Mediator mediator);
    public abstract void setColleagueEnabled(boolean enabled);
}
