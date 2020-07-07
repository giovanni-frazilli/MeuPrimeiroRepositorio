package projeto3vetor;
import java.util.Scanner;


//Em um processo seletivo para trainee em uma fintech, 
//foi solicitada a criação de um programa que permita calcular as médias dos valores
//de ações na bolsa ao longo de um mês.
//Nesse caso, considere que os meses têm 28 dias e quatro semanas.
//O programa deve apresentar as médias semanais (a menor e maior) e mensal.
//Trabalhe esse código em seu IDE, suba ele para sua conta no GitHub 
//e compartilhe o link desse projeto no campo ao lado para que outros desenvolvedores possam analisá-lo.

public class fintech {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); // habilita entrada de dados
		int [][] mes = new int [4][5];
		

		// Colocando os valores da cotacao na matriz de semana x dia
		for(int linha = 0; linha <= mes.length -1; linha++)
		{
			for(int coluna = 0; coluna <= mes[0].length -1; coluna ++)
			{
				System.out.print("Qual a cotação no dia "+coluna+ " da semana "+linha+ ".");
				mes[linha][coluna] = sc.nextInt();
			}
			System.out.print("\n");
		}
		
		
		// imprimindo a matriz
		for(int linha = 0; linha <= mes.length -1; linha++)
		{
			for(int coluna = 0; coluna <= mes[0].length -1; coluna ++)
			{
				System.out.print(mes[linha][coluna] + " ");
			}
			System.out.print("\n");
		}
		
		
		
		
		//calculando as medias semanais
		int [] media = new int[4];
		for(int linha = 0; linha <= mes.length -1; linha++)
		{
			for(int coluna = 0; coluna <= mes[0].length -1; coluna ++)
			{
				media[linha] = mes[linha][coluna] + media[linha];
			}
		}
		for (int linha = 0; linha<=media.length -1;linha++) 
		{
			media[linha]=media[linha]/5;
		}
		
		
		// imprimindo o vetor
		for(int linha = 0; linha <= media.length -1; linha++)
		{
			System.out.println("A media da semana "+linha+ " foi " + media[linha] );
		}
			
			
		
		sc.close();
	}

}
