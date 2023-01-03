package entregaexercicioaula2;

import java.util.Scanner;

public class entregaexercicioaula2 {

	public static void main(String[] args) {
		

		 Scanner ler = new Scanner(System.in);
	        int menor21=0, maior50=0, idade=0;

	        while(idade >= 0)
	        {
	            System.out.printf("Entre com a sua idade: ");
	            idade = ler.nextInt();

	            if(idade <21 && idade > 0)
	            {
	                menor21 += 1;
	            }
	            if(idade > 50)
	            {
	                maior50 += 1;
	            }
	        }
	        System.out.println("Total de pessoas menores de 21 anos: "+menor21);
	        System.out.println("Total de pessoas maiores de 50 anos: "+maior50);
	    }
	}
	





public class exercicio5aula2 {

	public static void main(String[] args) {
    
		Scanner leia = new Scanner(System.in);
        
        int num, soma = 0;
       
        
        do
        {
            System.out.println("Digite um número");
            num = leia.nextInt();
            
            if(num > 0)
            {
                soma = num + soma;
             
            }
        } while(num!=0);
        
        System.out.println("A soma é " + soma); 
    }

}



public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);

    int num,somaPar=0,somaImpar=0,x;


    for (x=1;x<=10;x++)
    {
        System.out.println("\nEntre com um número: ");
        num = leia.nextInt();
        if (num % 2 == 0)
        {
            somaPar++; // somaPar = somaPar + 1
        }
        else

            {
                somaImpar++;
            }

        }
        System.out.printf("\nTemos: "+somaPar+" números pares...");
        System.out.printf ("\nTemos: "+somaImpar+" números ímpares...");
    }
}

do while