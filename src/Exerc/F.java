package Exerc;

import java.util.Scanner;

public class F {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Digite um n�mero");
		int x = sc.nextInt();
		if(x%2==0) {
			System.out.println("O n�mero � par");
		}
		if(x%2==1) {
			System.out.println("O n�mero � �mpar");
		}
		sc.close();
	}

}
