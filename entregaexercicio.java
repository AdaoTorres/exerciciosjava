package entregaexercicio;

import java.util.Scanner;

public class entregaexercicio {

	public static void main(String[] args) {

		public static void main(String[] args) {
		
			Scanner leia = new Scanner(System.in);
			int idade;
			
			System.out.println("\nDigite sua idade: ");
			idade = leia.nextInt();
			

			if(idade>=65)
			{
				System.out.println("\nA pessoa está apta a votar e o voto é facultativo");
			}
			else if(idade>=18 && idade<65)
			{
				System.out.println("\nA pessoa está apta a votar e o voto é obrigatório");	
			}
			else if(idade>=16 && idade<18)
			{
				System.out.println("\nA pessoa está apta a votar e o voto é facultativo");
			}
			else
			{
				System.out.println("\nA pessoa não está apta a votar");
			}

		}

	}
	
	
	
	
	
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
	
	
	break
	
	switch
	
	case
	}

}
