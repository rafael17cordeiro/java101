import java.util.Scanner;  // Import the Scanner class

public class basicMath {
  	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.print("inserir valor 1: ");
		int valor1 = sc.nextInt();
		
		System.out.print("inserir valor 2: ");
		int valor2 = sc.nextInt();
		
		int w = valor1 + valor2;
		
		System.out.print("igual a: " + w);
		
		if( w >0){
			System.out.print("\no valor é: positivo");
		}else{
			System.out.print("\no valor é: negativo");	
		}*/
		
		
		
		System.out.print("inserir valor 1: ");
		int valor1 = sc.nextInt();
		
		System.out.print("inserir valor 2: ");
		int valor2 = sc.nextInt();
		
		int w = valor1 * valor2;
		System.out.print("igual a: " + w);
		
		if( w%2==0 ){
			System.out.print("\no valor é: par");
		}else{
			System.out.print("\no valor é: impar");	
		}
			
		
		
		
		
		
		
		
		
		
				
		
	}
}

