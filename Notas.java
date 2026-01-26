import java.util.Scanner;
public class Notas
{
	private int quantidadeDeNotas = 0;
	private int notaA = 0;
	private int notaB = 0;
	private int notaC = 0;
	private int notaD = 0;
	private int notaF = 0;
	private int somaDasNotas = 0;

	
	public void displayMessage()
	{
		System.out.println("coloque as notas dos alunos de 0 a 10 e aperte control+c para calcular as notas");
	}
	public void inserindoNotas()
	{
		int classificacao = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Digite as notas");
		while (true)
		{
			classificacao = input.nextInt();
			if(classificacao == -1)
			{
				break;
			}
			somaDasNotas += classificacao;
			quantidadeDeNotas++;
			classificacaoDasNotas(classificacao);
		}
	}

	public void classificacaoDasNotas( int classificacao )
	{
		switch (classificacao)
		{
			case 9:
			case 10:
				++notaA;
				break;
			case 8:
				++notaB;
				break;
			case 7:
				++notaC;
				break;
			case 6:
				++notaD;
				break;
			default:
				++notaF;
				break;
			}
		}
	
	public double mediaDasNotas()
	{
	return (double) somaDasNotas / quantidadeDeNotas;
	}
	
	public void mensagemFinal()
	{	
		System.out.println("");
		System.out.println(
		 "Classificação final das Notas foram: " +
   		 " | A: " + notaA +
   		 " | B: " + notaB +
   		 " | C: " + notaC +
   		 " | D: " + notaD +
   		 " | F: " + notaF
		);
		System.out.println("media total das notas foram: " + mediaDasNotas() );
		System.out.println("total das notas por quantidade: " + quantidadeDeNotas);
	}
}