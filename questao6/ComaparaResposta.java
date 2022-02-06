package questao6;

public class ComaparaResposta {
	protected static  int erros;
	protected static int acertos;
	
	//Compara para saber se a resposta est� correta, contabiliza os erros
	// e acertos, e tamb�m mostra na tela se acertou(quando chamada).
	public void Resposta(String userAnswer, String correctAnswer){

	if(userAnswer.equals(correctAnswer)) {
		System.out.println("Correto!!\n\n");
		acertos = getAcertos() + 1;
		
	}else {
		erros = getErros() + 1;
		System.out.println("Errado!\n\n");
	
	
}
}
	public int getAcertos() {
		return this.acertos;
	}
	public int getErros() {
		return this.erros;
	}
}
