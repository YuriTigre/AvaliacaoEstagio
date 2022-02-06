package questao6;
import java.util.Scanner;
public class Corpo extends ComaparaResposta{
	//Classe que contem a main e estrutura todo o código.
	public static void main(String[] args){
		Quiz user = new Quiz();
		Usuario usuario = new Usuario();
		System.out.println("Seja bem - vindo(a) ao quiz");
		Scanner scan = new Scanner(System.in);
		usuario.Pessoa();
		user.quizup();
		System.out.println("Usuario: "+ usuario.getNome() );
		System.out.println("Voce acertou:" + acertos + " perguntas");
		System.out.println("Voce errou:" + erros + " perguntas");
		
	}
	
	
}
