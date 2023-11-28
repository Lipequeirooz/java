package fundamentos;

import java.util.Scanner;

public class desafio4 {

	public static void main(String[] args) {
		Scanner G = new Scanner(System.in);
		System.out.println("letra para identificar seu sexo");
		char Sexo = G.nextLine().charAt(0);
		
		if (Sexo == 'F') {
			System.out.println("Feminino");
		
		}else if (Sexo == 'M') {
			System.out.println("Masculino");
		
		}else {
			System.out.println("tente novamente");
		}

	}

}
