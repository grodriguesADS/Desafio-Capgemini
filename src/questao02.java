/**
 * Débora se inscreveu em uma rede social para se manter em contato com seus amigos. 
 * A página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser forte. 
 * O site considera uma senha forte quando ela satisfaz os seguintes critérios:
  -Possui no mínimo 6 caracteres.
  -Contém no mínimo 1 digito.
  -Contém no mínimo 1 letra em minúsculo.
  -Contém no mínimo 1 letra em maiúsculo.
  -Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()
 
 * Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é uma senha forte. 
 * Para ajudar Débora, construa um algoritmo que informe qual é o número mínimo de caracteres que devem 
 * ser adicionados para uma string qualquer ser considerada segura.
 */
public class questao02 {
	
	/**
	 * Faz a verificação se a senha tem o minimo de 6 caracteres para ser considerada segura.
	 * 
	 * @param String senha
	 */
	public void verificacaoSenha(String senha) {
		
		//Verifica se a senha já tem 6 caracteres
		if (senha.length() < 6) {
			//Calcula e printa quantos caracteres faltam
			System.out.println("Resultado: Faltam " + (6 - senha.length() + " Caracteres" ));
		}
		
			if (senha.matches("(?=.*[!@#$%^&*()-+])(?=.*[a-zA-Z])(?=.*[0-9]).{6,}")){
				System.out.println("Senha válida");
			} else {
				System.out.println("Senha inválida");
			}
		}
		
	}
	

