package exercicios;

import java.util.Scanner;

public class Desafio01 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
	
	   int mes;
		
		
		System.out.println("Informe o número do mês desejado");
		mes = ler.nextInt();
		
		if(mes == 1) {
			System.out.println("O mês informado é Janeiro");
		}
		else if(mes == 2) {
			System.out.println("O mês informado é Fevereiro");
		}
		else if(mes == 3) {
			System.out.println("O mês informado é Março");
		}
		else if(mes == 4) {
			System.out.println("O mês informado é Abril");
		}
		else if(mes == 5) {
			System.out.println("O mês informado é Maio");
		}
		else if(mes == 6) {
			System.out.println("O mês informado é Junho");
		}
		else if(mes == 7) {
			System.out.println("O mês informado é Julho");
		}
		else if(mes == 8) {
			System.out.println("O mês informado é Agosto");
		}
		else if(mes == 9) {
			System.out.println("O mês informado é Setembro");
		}
		else if(mes == 10) {
			System.out.println("O mês informado é Outubro");
		}
		else if(mes == 11) {
			System.out.println("O mês informado é Novembro");
		}
		else if (mes == 12) {
			System.out.println("O mês informado é Dezembro");
		}
		else {
			System.out.println("Mês inválido");
		}

	}

}
