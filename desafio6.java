package fundamentos;

import java.util.Scanner;

public class desafio5 {

	public static void main(String[] args) {
		System.out.println("1 para sim e 2 para não");
		
		Scanner entrada = new Scanner(System.in);
		int n1;
		
		System.out.println("telefou p a vitima?");
		n1 = entrada.nextInt();
	
		Scanner entrada2 = new Scanner(System.in);
		int n2;
	
		System.out.println("esteve perto da vitima?");
		n2 = entrada2.nextInt();
		
		Scanner entrada3 = new Scanner(System.in);
		int n3;
	
		System.out.println("mora proximo a vitima?");
		n3 = entrada3.nextInt();
		
		Scanner entrada4 = new Scanner(System.in);
		int n4;
	
		System.out.println("devia para a vitima?");
		n4 = entrada4.nextInt();
		
		Scanner entrada5 = new Scanner(System.in);
		int n5;
	
		System.out.println("Já trabalhou com a vitima?");
		n5 = entrada5.nextInt();	
		
		int soma = (n1 + n2 + n3 + n4 +n5);
		
		if (soma == 5 || soma == 6) {
			System.out.println("Inocente");
		}
		else if(soma == 7) {
			System.out.println("Suspeito");
			
		}else if (soma == 8 || soma == 9) {
				System.out.println("Cumplice");
		
		}else if (soma == 10) {
			System.out.println("Assasino");
		
		}else {
			System.out.println("Erro");
		}
	}
		
		
}

