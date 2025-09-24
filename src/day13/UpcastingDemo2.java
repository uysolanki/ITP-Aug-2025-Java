package day13;

public class UpcastingDemo2 {
public static void main(String[] args) {
	
	
	Amitabh a1=new Amitabh();
	
	System.out.println(a1.qualification);
	a1.home();
	a1.car();
	a1.office();
	
	Amitabh a2=new Abhishek();
	System.out.println(a2.qualification);
	a2.home();
	a2.car();
	a2.office();
	

}
}
