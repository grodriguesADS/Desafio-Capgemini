/**
 * D�bora se inscreveu em uma rede social para se manter em contato com seus amigos. 
 * A p�gina de cadastro exigia o preenchimento dos campos de nome e senha, por�m a senha precisa ser forte. 
 * O site considera uma senha forte quando ela satisfaz os seguintes crit�rios:
  -Possui no m�nimo 6 caracteres.
  -Cont�m no m�nimo 1 digito.
  -Cont�m no m�nimo 1 letra em min�sculo.
  -Cont�m no m�nimo 1 letra em mai�sculo.
  -Cont�m no m�nimo 1 caractere especial. Os caracteres especiais s�o: !@#$%^&*()
 
 * D�bora digitou uma string aleat�ria no campo de senha, por�m ela n�o tem certeza se � uma senha forte. 
 * Para ajudar D�bora, construa um algoritmo que informe qual � o n�mero m�nimo de caracteres que devem 
 * ser adicionados para uma string qualquer ser considerada segura.
 */
public class questao02 {
	
	/**
	 * Faz a verifica��o se a senha tem o minimo de 6 caracteres para ser considerada segura.
	 * 
	 * @param String senha
	 */
	public void verificacaoSenha(String senha) {
		
		//Verifica se a senha j� tem 6 caracteres
		if (senha.length() < 6) {
			//Calcula e printa quantos caracteres faltam
			System.out.println("Resultado: Faltam " + (6 - senha.length() + " Caracteres" ));
		}
		
			if (senha.matches("(?=.*[!@#$%^&*()-+])(?=.*[a-zA-Z])(?=.*[0-9]).{6,}")){
				System.out.println("Senha v�lida");
			} else {
				System.out.println("Senha inv�lida");
			}
		}
		
	}
	

