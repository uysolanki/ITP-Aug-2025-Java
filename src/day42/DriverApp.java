package day42;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class DriverApp {

	public static void main(String[] args) {
	Engine engine1=new Engine(25,2500,"Petrol","Honda");
	
	Engine engine2=new Engine();
	engine2.setEngineCC(3500);
	engine2.setEngineLitre(35);
	engine2.setEngineMfg("Toyota");
	engine2.setEngineType("Diesel");
	
	System.out.println(engine1);
	System.out.println(engine2);
	}

}
