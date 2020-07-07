package tabuada;
import java.util.Scanner;

public class resultado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); // habilita entrada de dados
		int num, tab;
		
		do{
			System.out.println("Digite a nota da prova");
			num = sc.nextInt();
		}while (num < 0 || num > 10);
		
	
		
		for (int i = 1;i <= 10; i++) {
			tab = num*i;
			System.out.println(num + " x "+i+" = "+tab);

			
		}
		
		
		
		
		
		sc.close();

	}

}
