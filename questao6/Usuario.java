package questao6;
import java.util.Scanner;
public class Usuario {
	public static String nome;


	//Apenas serve para pegar o nome do usuario. 
	public void Pessoa(){
		Usuario user = new Usuario();
		Scanner scan = new Scanner(System.in);

		System.out.print("Por favor digite seu nome de usu�rio: ");
		String nome = scan.nextLine();
	
		System.out.println("\nOl� " + nome +", seu quiz vai come�ar. Boa sorte!!\n");
		user.setNome(nome);
	} 
	
	
	public String getNome() {
		
		return Usuario.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
	
	

