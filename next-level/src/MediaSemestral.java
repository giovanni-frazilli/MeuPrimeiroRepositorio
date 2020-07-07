import java.util.Scanner;

public class MediaSemestral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); // habilita entrada de dados
		float prova;
		
		do{
			System.out.println("Digite a nota da prova");
			prova = sc.nextFloat();
		}while (prova < 0 || prova > 10);
		
		System.out.println("Digite a nota do projeto");
		float projeto = sc.nextFloat();
		
		System.out.println("Digite a nota da lista de exercício");
		float lista = sc.nextFloat();
		
		System.out.println("Digite a nota da contribuição em projetos de software livre");
		float cont = sc.nextFloat();
		
		float nota = (prova * 3 + projeto * 3 + lista * 2 + cont * 3)/11; // media das notas
		
		
		float falta = 8 - nota; // quanto falta de nota
		
		boolean resultado = nota >= 8; // verifica se aluno passou.
		
		if (resultado)
		{
			System.out.println("A nota final é "+nota+". O aluno foi aprovado.");

		}
		else
		{
			System.out.println("A nota final é "+nota+". O aluno foi reprovado. Faltam "+falta+ " pontos.");

		}
			
				
		sc.close();
	}

}
