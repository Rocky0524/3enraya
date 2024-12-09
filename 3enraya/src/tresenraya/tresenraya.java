package tresenraya;

import java.util.Scanner;
import java.util.Random;

public class tresenraya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
Random random = new Random();		

		//pregunta los nombres de los dos jugadores
System.out.println("jugador 1 cual es tu nombre?");
String jugador1 =s.next();
System.out.println("jugador 2 cual es tu nombre?");
String jugador2 =s.next();


System.out.println("\n Ahora se tirara la moneda");

int moneda= random.nextInt(2);
if(moneda ==1) {
	System.out.println("\n La moneda a salido cruz");
}else {
	System.out.println("\n La moneda a salido cara");
}

//matriz declarada para el juego
	String matriz[][]= {{".", ".", "."},
						{".", ".", "."},
						{".", ".", "."}};	
	

	}

}
