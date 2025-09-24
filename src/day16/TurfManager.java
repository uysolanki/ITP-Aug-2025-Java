package day16;

public class TurfManager {
			
	static Turf turf=null;
	
	static Turf getTurf(int turfChoice)
		{
		switch(turfChoice)
		{
		case 1 : 	turf=new CricketTurf();	break;
		case 2 : 	turf=new FootballTurf();break;
		case 3 : 	turf=new TennisTurf();	break;
		case 4 : 	turf=new SkatingTurf();	break;
		}
		return turf;
	}
}
