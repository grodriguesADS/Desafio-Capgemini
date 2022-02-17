/**
 * Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espa�os.
 * A base e altura da escada devem ser iguais ao valor de n. 
 * A �ltima linha n�o deve conter nenhum espa�o.
 */
public class questao01 {
	
	
	/**
	 * Recebe o valor e transforma em uma escada com a largura e altura no valor designado.
	 * 
	 * @param Inteiro n
	 */

	public void escada(int n) {
		String caractere = "";
		//Delimita a largura da escada
		for (int i = 0; i < n; i++) {
			caractere += " ";
		}
		//Transformar a String em um Array de Chars
		char escada[] = caractere.toCharArray();
		int index = n - 1;
		//Cria a escada adicionando "*" em suas posi��es e printando a cada loop
			while (index >= 0) {
				escada[index] = '*';
				System.out.println(escada);
				index --;
		}
	}
	
}
