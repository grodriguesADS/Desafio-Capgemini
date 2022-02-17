import java.util.Scanner;
/**
 * Classe destinada a execução do programa com todas as questões dadas
 * no Desafio de Programação, podendo ser escolhida a questão que deseja executar
 * através de um valor inteiro dado pelo usuario e executado na Switch case.
 * 
 * @author Guilherme Rodrigues
 *
 */
public class main {

	public static void main(String[] args) throws InterruptedException {
		
		int i = 0;
		Scanner leitor = new Scanner(System.in);
		while (i == 0) {
		System.out.println("-------- Desafio de Programação ---------");
		System.out.println("Questão 01 - Escada - [1] \nQuestão 02 - Senha - [2]\nQuestão 03 - Anagrama - [3]\nSair - [4]");
		System.out.print("Escolha a opção digitando o número correspondente: ");
		//Obter a escolha do usuario
		int opcao = Integer.parseInt(leitor.nextLine());
		//Executar a questão desejada
		switch (opcao) {
		case 1:
			questao01 q1 = new questao01();
			System.out.print("Digite o tamanho da escada: ");
			int tamanho = Integer.parseInt(leitor.nextLine());
			System.out.println("Resultado: ");
			q1.escada(tamanho);
			Thread.sleep( 5 * 1000 ); // aguarda 5s
			break;
		case 2:
			questao02 q2 = new questao02();
			System.out.print("Digite sua senha: ");
			String senha = leitor.nextLine();
			q2.verificacaoSenha(senha);
			Thread.sleep( 5 * 1000 ); // aguarda 5s
			break;
		case 3:
			questao03 q3 = new questao03();
			System.out.println("Digite a palavra: ");
			String palavra = leitor.nextLine();
			System.out.println("Resultado: " + q3.verificaAnagramas(palavra, palavra.length()));
			Thread.sleep( 5 * 1000 ); // aguarda 5s
			break;
		case 4:
			System.out.println("----------------");
			System.out.println("Fim do programa");
			//ordem de parada while
			i ++;
			break;
		//Caso o usuario não digite um valor correspondente 
		default:
			System.out.println("Valor invalido");
			Thread.sleep( 5 * 1000 ); // aguarda 5segundos
			break;
		}
		
	}
		leitor.close();
}
}
