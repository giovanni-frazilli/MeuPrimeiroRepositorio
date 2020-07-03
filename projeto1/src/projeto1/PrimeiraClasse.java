package projeto1;
import java.util.Scanner;

public class PrimeiraClasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome");
		String nome = sc.nextLine();
		System.out.println("Bem vindo "+nome+".");
		System.out.println("Digite um número");
		int num = sc.nextInt();
		int dobro = num*2;
		System.out.println("O dobro de "+num+" é "+dobro+".");
		sc.close();
		
	}

}
