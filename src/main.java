import java.util.Scanner;
/**
 * Classe destinada a execu��o do programa com todas as quest�es dadas
 * no Desafio de Programa��o, podendo ser escolhida a quest�o que deseja executar
 * atrav�s de um valor inteiro dado pelo usuario e executado na Switch case.
 * 
 * @author Guilherme Rodrigues
 *
 */
public class main {

	public static void main(String[] args) throws InterruptedException {
		
		int i = 0;
		Scanner leitor = new Scanner(System.in);
		while (i == 0) {
		System.out.println("-------- Desafio de Programa��o ---------");
		System.out.println("Quest�o 01 - Escada - [1] \nQuest�o 02 - Senha - [2]\nQuest�o 03 - Anagrama - [3]\nSair - [4]");
		System.out.print("Escolha a op��o digitando o n�mero correspondente: ");
		//Obter a escolha do usuario
		int opcao = Integer.parseInt(leitor.nextLine());
		//Executar a quest�o desejada
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
		//Caso o usuario n�o digite um valor correspondente 
		default:
			System.out.println("Valor invalido");
			Thread.sleep( 5 * 1000 ); // aguarda 5segundos
			break;
		}
		
	}
		leitor.close();
}
}
