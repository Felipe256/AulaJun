package Exerc;

import java.util.Scanner;

public class G {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número");
		int x = sc.nextInt();
		System.out.println("Digite um número");
		int y = sc.nextInt();
		System.out.println("Digite um número(1 para +, 2 para -, 3 para *, 4 para /)");
		int a = sc.nextInt();
		switch(a) {
		case 1:
			int t =x+y;
			System.out.println(t);
			break;
		case 2:
			int b =x-y;
			System.out.println(b);
			break;
		case 3:
			int c =x*y;
			System.out.println(c);
			break;
		case 4:
			int d =x/y;
			System.out.println(d);
			break;
		}
		
		sc.close();
	}

}
