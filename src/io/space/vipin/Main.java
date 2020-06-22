package io.space.vipin;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions=new Dimensions(10,20,5);
        Motherboard motherboard=new Motherboard("ST-101","Dell",2,2,"bios-1.0");
        Resolution resolution= new Resolution(10,20);
        Monitor monitor=new Monitor("mn-22","hp",20,resolution);
        Case theCase=new Case("cs-121","acer","250W",dimensions);
	    PC pc = new PC(motherboard,resolution,monitor,theCase, dimensions);
	    pc.getMotherboard().getModel();
        System.out.println(pc.getMotherboard().getModel());
        System.out.println(pc.getMonitor().getModel());
        System.out.println(pc.getResolution().getHeight());
        System.out.println(pc.getTheCase().getManufacturer());
        System.out.println("completed");
    }
}
