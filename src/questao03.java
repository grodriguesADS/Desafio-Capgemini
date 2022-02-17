import java.util.ArrayList;
import java.util.Arrays;

/**
 * Duas palavras podem ser consideradas anagramas de si mesmas se as letras
 * de uma palavra podem ser realocadas para formar a outra palavra.
 * Dada uma string qualquer, desenvolva um algoritmo que encontre o número 
 * de pares de substrings que são anagramas.
 * 
 * 
 */


public class questao03 {

		/**
		 * De forma recursiva faz a transformação de uma String em subStrings, 
		 * assim adicionado a um Array para fazer a comparação e contagem dos anagramas.
		 *  
		 * @param String str, Inteiro tamanho
		 * @return Quantidade de anagramas
		 */
		public int verificaAnagramas(String str, int tamanho) {
			int qtd = 0;

			ArrayList<String> subStrings = new ArrayList<String>();
			//Adicionar substrings ao Array
			for (int i = 0; i <= str.length() - tamanho; i++) {
				subStrings.add(str.substring(i, i + tamanho));
			}
			
			//Separar e conferi quais são anagramas
			for (int i = 0; i < subStrings.size(); i++) {
				for (int c = i + 1; c < subStrings.size(); c++) {

					String sub1 = subStrings.get(i);
					String sub2 = subStrings.get(c);

					if (isAnagrama(sub1, sub2)) {
						qtd++; 
					}
				}
			}

			if (tamanho == 1) {
				return qtd;
			}
			return qtd + verificaAnagramas(str, tamanho - 1);
		}
		/**
		 * Faz a comparação de duas string com a finalidade de verificar
		 * se são anagramas umas das outras.
		 * 
		 * @param String str1 , String str2
		 * @return Boolean
		 */
		private static boolean isAnagrama(String str1, String str2) {
			
			//Adiciona a um Array de Char
			char[] char1 = str1.toCharArray();
			char[] char2 = str2.toCharArray();
			
			//Ordena os Arrays
			Arrays.sort(char1);
			Arrays.sort(char2);
			
			//Verifica se são iguais
			return Arrays.equals(char1, char2);
		}
	

}
