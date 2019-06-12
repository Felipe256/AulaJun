package Exerc;

import java.util.Scanner;

public class F {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Digite um número");
		int x = sc.nextInt();
		if(x%2==0) {
			System.out.println("O número é par");
		}
		if(x%2==1) {
			System.out.println("O número é ímpar");
		}
		sc.close();
	}

}
