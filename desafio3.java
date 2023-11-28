package fundamentos;

import java.util.Scanner;

public class desafio2 {

	public static void main(String[] args) {
		Scanner dia = new Scanner(System.in);
		System.out.println("Informe o numero da semana");
		double semana = dia.nextDouble();
		
		if (semana == 1) {
			System.out.println("Domingo");
		}else if (semana == 2) {
			System.out.println("Segunda");
		}else if (semana == 3) {
			System.out.println("Terca");
		}else if (semana == 4) {
			System.out.println("Quarta");
		}else if  (semana == 5) {
			System.out.println("Quinta");
		}else if (semana == 6) {
			System.out.println("Sexta");}
		else if (semana == 7) {
			System.out.println("Sabado");}
		else{
			System.out.println("numero invalido");}
	}
	}

