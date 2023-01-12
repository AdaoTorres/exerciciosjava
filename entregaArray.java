package entregaArray;

public class entregaArray {

	public static void main(String[] args) {

		
		package ercicioArray;

		import java.util.Scanner;

		public class exercicioArrayVetor {

			public static void main(String[] args) {
			
				
				Scanner leia = new Scanner(System.in);
				
				int numero[] = new int[10];
				int x,somaNum=0;
				float mediaNum;
				
				for(x=0;x<10;x++) {
					System.out.println("\nEntre com um número: ");//6 13 56
					numero[x] = leia.nextInt();
					somaNum += numero[x];
				}
				mediaNum = somaNum / 10;
				System.out.println("\nElementos de índice ímpar");
				for(x=0;x<10;x++) {
					if(x % 2 == 1) {
						System.out.println("\n"+numero[x]);
					}
				}
				
				System.out.println("\nElementos do vetor que são números pares");
				for(x=0;x<10;x++) {
					if(numero[x] % 2 == 0) {
						System.out.println("\n"+numero[x]);
					}
				}
				
				System.out.println("\nSoma de todos os elementos do meu array: "+somaNum);
				System.out.println("\nMédia dos elementos do array: "+mediaNum);

			}


			

		}


		
		
		
		
		
		package exercicioArray;

		import java.util.Scanner;

		public class exercicioArrayMatriz {

			public static void main(String[] args) {
			
				
				Scanner leitura = new Scanner(System.in);
				
				int numeros[][] = new int[2][3];
				//String placas[][] = new String[2][3];
				
				int linha,coluna,somaNumeros=0;
				
				for(linha=0;linha<2;linha++) {
					for(coluna=0;coluna<3;coluna++) {
						System.out.println("\nEntre com um número qualquer: ");
						numeros[linha][coluna] = leitura.nextInt();
						somaNumeros += numeros[linha][coluna];
					}
				}
				System.out.println("\nSomatório dos números foi de: "+somaNumeros);
				
				for(linha=0;linha<2;linha++) {
					System.out.println("\n");
					for(coluna=0;coluna<3;coluna++) {
						System.out.printf("%d , ",numeros[linha][coluna]);
					}
				}

			

			}

		}

	}

}
