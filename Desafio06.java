package exercicios;

import java.util.Scanner;

public class Desafio06 {

	public static void main(String[] args) {


		Scanner ler = new Scanner (System.in);

		int a,b,c, CPF = 452045388, senha = 123456, saldo = 2000;



		System.out.println("Olá seja bem vindo(a) para iniciarmos digite seu CPF sem pontos somente com o traço no final");
		a = ler.nextInt();

		if(a == CPF) {
			System.out.println("Agora digite sua senha para continuarmos");
			b = ler.nextInt();
			
			if (b == senha){
				System.out.println("Seja Bem vindo Rudinilson!");
				System.out.println("Qual o valor que você deseja sacar hoje? Saldo atual: R$" + saldo);
				c = ler.nextInt();
				 
				if(c > saldo) {
					
					System.out.println("Saque indisponível, pois o valor solicitado é maior que o saldo atual");}
				
				else if(c <= saldo) {
					System.out.println("Saque confirmado! Seu saldo atual é de: R$");
				}
			}
			else {
				System.out.println("Tente novamente, senha incorreta");
			}
		}
		else{
			System.out.println("CPF inválido");}
		
	}
}