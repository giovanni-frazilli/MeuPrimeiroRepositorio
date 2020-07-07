package tabuada;
import java.util.Scanner;

public class resultado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] vetor1 = new int[3];
		int[] vetor2 = {4, 10, -5, 661, -3};
		System.out.println(vetor1[0]);
		System.out.println(vetor2[0]);
		
		vetor1[0] = 10;
		vetor1[1] = 20;
		vetor1[2] = 30;
		for (int i = 0; i <= vetor1.length -1; i++) {
			System.out.println(vetor1[i]);

		}
		
		// vetor3 e vetor4 são iguais no vetor 4 primeiro aparece a linha 1 , depois linha 2
		int [][]vetor3 = new int[2][3];
		vetor3[0][0]=3;
		vetor3[0][1]=2;
		vetor3[0][2]=6;
		vetor3[1][0]=1;
		vetor3[1][1]=2;
		vetor3[1][2]=5;
		int [][] vetor4 = {{3,2,6},{1,2,5}};
		
		for (int linha = 0; linha <= vetor3.length -1 ; linha ++)
		{
			for (int coluna = 0; coluna <= vetor3[0].length -1  ; coluna ++)
			{
				System.out.print(vetor3[linha][coluna]+" ");
			}
			System.out.print("\n");
		}
		
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
