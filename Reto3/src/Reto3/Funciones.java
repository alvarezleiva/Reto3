package Reto3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Funciones {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);

		int e = dimeEntero("Introduce un número entero", sc);
		double d = dimeDouble("Introduce un número decimal", sc);
	}

	public static boolean esInt(String s) {

		try {
			int num = Integer.parseInt(s);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static boolean esDouble(String s) {
		try {
			double num = Integer.parseInt(s);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static int dimeEntero(String texto, Scanner sc) {
		do {
			try {
				System.out.println(texto);
				String s = sc.nextLine();
				int n = Integer.parseInt(s);
				return n;
			} catch (Exception ex) {
				System.out.println("Introduce un nº correcto");
			}
		} while (true);

	}
	public static double dimeDouble(String texto, Scanner sc) {
		do {
			try {
				System.out.println(texto);
				String s = sc.nextLine();
				double n = Double.parseDouble(s);
				return n;
			} catch (Exception ex) {
				System.out.println("Introduce un nº decimal correcto");
			}
		} while (true);

	}
	public static LocalDate dimeFecha(String texto, Scanner sc) {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		do {
			try {
				System.out.println(texto);
				String fecha = sc.nextLine();
				LocalDate ld = LocalDate.parse(fecha, formato);
				return ld;
			} catch (Exception e) {
				System.out.println("Fecha incorrecta");
			}
		} while (true);

}
}
