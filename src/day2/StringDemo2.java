package day2;

public class StringDemo2 {

	public static void main(String[] args) {
		System.out.println(String.format("%10s %-10d", "Tie",500));
		System.out.println(String.format("%10s %-10d", "Belt",700));
		System.out.println(String.format("%10s %-10d", "Trouser",1500));
		System.out.println(String.format("%10s %-10d", "Laptop",30000));
		System.out.println(String.format("%10s %-10d", "Total",32700));
	}

}

/*
 Style A
Tie500
Belt700
Trouser1500
Laptop30000

Total32700
*/

/*
Style B
Tie       500
Belt      700
Trouser   1500
Laptop    30000

Total     32700
*/

/*
Style c
       Tie500
      Belt700
   Trouser1500
    Laptop30000

     Total32700
*/