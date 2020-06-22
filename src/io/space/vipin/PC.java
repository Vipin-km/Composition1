package io.space.vipin;

public class PC {
    private Motherboard motherboard;
    private Resolution resolution;
    private Monitor monitor;
    private Case theCase;
    private  Dimensions dimensions;

    public PC(Motherboard motherboard, Resolution resolution, Monitor monitor, Case theCase,Dimensions dimensions) {
        this.motherboard = motherboard;
        this.resolution = resolution;
        this.monitor = monitor;
        this.theCase = theCase;
        this.dimensions=dimensions;
    }







    public Motherboard getMotherboard() {
        return motherboard;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Case getTheCase() {
        return theCase;
    }
}
