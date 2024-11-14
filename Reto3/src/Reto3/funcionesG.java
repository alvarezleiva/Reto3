package Reto3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class funcionesG {

	public static void mismoaño(LocalDate fecha1, LocalDate fecha2) {

		Scanner sc = new Scanner(System.in);

		String pequeno = "";
		String alfabetico = "";

		String s = "";
		int len = 0;
		int meses = (int) ChronoUnit.MONTHS.between(fecha1, fecha2);
		
		

		
		if (meses < 3) {
			for (int i = 0; i < 4; i++) {
				System.out.println("Introduce nombre");
				s = sc.nextLine();
				
				//Valor más pequeño
				if( len == 0) {
					pequeno = s;}
			}
				//Alfabéticamente primero
			if(s.charAt(0) == 'a') {
				alfabetico = s;
			}
		}

		System.out.println("El más pequeño es " + pequeno);
		System.out.println("El que alfabéticamente va primero es " + alfabetico);
	}
}
