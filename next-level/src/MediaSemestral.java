import java.util.Scanner;

public class MediaSemestral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); // habilita entrada de dados
		
		System.out.println("Digite a nota da prova");
		float prova = sc.nextFloat();
		
		System.out.println("Digite a nota do projeto");
		float projeto = sc.nextFloat();
		
		System.out.println("Digite a nota da lista de exercício");
		float lista = sc.nextFloat();
		
		System.out.println("Digite a nota da contribuição em projetos de software livre");
		float cont = sc.nextFloat();
		
		float nota = (prova * 3 + projeto * 3 + lista * 2 + cont * 3)/11; // media das notas
		
		boolean resultado = nota > 8;
		
		float falta = 10 - nota;
		
		System.out.println("A nota final é "+nota+". O aluno foi aprovado? "+resultado+". Faltam "+falta+ " pontos.");
		
		sc.close();
	}

}
