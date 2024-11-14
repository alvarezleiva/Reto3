package Reto3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class funcionesG {

	public static void mismoaño(LocalDate fecha1, LocalDate fecha2) {

		Scanner sc = new Scanner(System.in);

		String s = "";
		int len = s.length();
		int meses = (int) ChronoUnit.MONTHS.between(fecha1, fecha2);

		System.out.println("Introduce algunas frases");
		if (meses < 3) {
			for (int i = 0; i < 4; i++) {
				s = sc.nextLine();
		
				
			}
			System.out.println(s);
		}
		

	}
}
