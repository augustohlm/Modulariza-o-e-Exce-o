package java_Exececao_Modularizacao;
import java.util.Scanner;


public class Exercicio_0 {

	public static int soma(int a, int b) {
		int soma = a + b;
	return(soma);
	
	}
	
	public static int subtracao(int a, int b) {
		int sub = a - b;
		return (sub);
	}
	
	public static int multiplicacao(int a, int b) {
		int mult = a*b;
		return(mult);
	}
	public static int potencia(int a, int b) {
		int result = 1;
		for(int i = 0; i < b; i++) {
			result = result * a;
		}
		return (result);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int N1, N2, op;
	
		System.out.print("Informe o 1º valor: ");
		N1 = sc.nextInt();
		System.out.print("Informe o 2º valor: ");
		N2 = sc.nextInt();
		
		do {
			
			System.out.print("\n Informe qual opção deseja seguir"
					+"\n 1 - SOMAR"
					+"\n 2 - SUBTRAÇÃO"
					+"\n 3 - MULTIPLICAÇÃO"
					+"\n 4 - POTENCIAÇÃO"
					+"\n 5 - SAIR"
					+"\n Opção: ");
				op = sc.nextInt();
				
			switch(op) {
			
			case 1:
				try {
					System.out.println("Resultado gerado: " + soma(N1, N2));
				}catch(ArithmeticException e) {
					System.out.print("ERRO");
				  } finally {
					  System.out.print("Concluído"
							           + "\n ");
				  }
					break;
			
			case 2:
				try {
					System.out.println("Resultado gerado: " + subtracao(N1, N2));
				}catch(ArithmeticException e) {
					System.out.print("ERRO");
				  } finally {
					  System.out.print("Concluído"
							  		 + "\n ");
				  }
				break;
				
			case 3:
				try {
					System.out.println("Resultado gerado: " + multiplicacao(N1, N2));
				}catch(ArithmeticException e) {
					System.out.print("ERRO");
				  } finally {
					  System.out.print("Concluído" 
							  		 + "\n ");
				  }
				break;
			case 4:
				try {
					System.out.println("Resultado gerado: " + potencia(N1, N2));
				}catch(ArithmeticException e) {
					System.out.print("ERRO");
				  } finally {
					  System.out.print("Concluído" 
							  		 + "\n ");
				  }
				break;
			
			default: if(op > 5){
				System.out.print("Informe a opção correta!!!");
			} break;
		}
			
				
			
		}while(op != 5);
		System.out.print("Programa encerrado!!");
	sc.close();	
		
	}

}
