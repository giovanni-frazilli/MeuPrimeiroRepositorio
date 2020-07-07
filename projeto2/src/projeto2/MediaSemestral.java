package projeto2;

import java.util.Scanner;

public class MediaSemestral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); // habilita entrada de dados
		
		
		int alunos, aprov=0, rep=0;
		// descobre a quantidade de alunos
		do{
			System.out.println("Digite a quantidade de alunos");
			alunos = sc.nextInt();
		}while (alunos < 0 );
		
		float prova, projeto, lista, media=0, maior=0, menor=0;
				
		
		//recebe as notas dos alunos
		for (int i = 1;i <= alunos; i++) {
			System.out.println("Digite a nota da prova do aluno "+i);
			prova = sc.nextFloat();
			System.out.println("Digite a nota do projeto do aluno "+i);
			projeto = sc.nextFloat();
			System.out.println("Digite a nota da lista de exercícios do aluno "+i);
			lista = sc.nextFloat();
			
			float mediaaluno = (prova*5 + projeto*3 + lista*2)/10;
								
			if (i==1) {
				media = mediaaluno;
				menor = mediaaluno;
				maior = mediaaluno;
				if (mediaaluno >= 8) {aprov = 1;}
				if (mediaaluno < 5) {rep=1;}
				
				continue;
			}
			
			media = media + mediaaluno;
			if (mediaaluno > maior) {
				maior = mediaaluno;
				
			}
			
			if (mediaaluno < menor) {
				menor = mediaaluno;
			}
			if (mediaaluno >= 8) {aprov = aprov + 1;}
			if (mediaaluno < 5) {rep = rep+ 1;}
		}
		
		
		media = media / alunos;
			
		System.out.println("A media geral é "+media);
		System.out.println("A maior media é "+maior);
		System.out.println("A menor media é "+menor);
		System.out.println("Reprovados "+rep);
		System.out.println("Aprovados "+aprov);


			
			
			
		
		
		
		

		
		sc.close();

	}

}
