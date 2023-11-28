package fundamentos;

import java.util.Scanner;

public class desafio3 {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("digite a primeira nota");
		float nota1 = n.nextFloat();
		
		System.out.println("digite a segunda nota");
		float nota2 = n.nextFloat();
		
		float media = (nota1 + nota2) / 2;
		System.out.println(media);
		
		if (media >= 7){
			System.out.println("Aluno aprovado");
	
		}else if (media <= 4){
			System.out.println("aluno reprovado");}
		
		else {
			System.out.println("Aluno em recuperacao");}
		}
	}


