package exercicio2;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num;
		
		System.out.println("\nEntre com um número inteiro: ");
		num = leia.nextInt();
				
		if(num<0)
		{
			System.out.println("\nNúmero negativo");
		}
		else
		{
			System.out.println("\nNúmero positivo");
		}
		if(num % 2 == 0)
		{
			System.out.println("\nNúmero par");
		}
		else
		{
			System.out.println("\nNúmero impar");
		}
	}

}