package questao7;
import java.io.IOException;
import java.util.Scanner;

//Tem como objetivo fazer o login após o cadastro e no caso de inserir os dados corretos
//é exibido uma mensagem dependendo do horario, caso não mostra uma mensagem de erro
public class Login extends HorasVerifica{
	
	public static void Logar(String usuario, String senha){
		Scanner entrada = new Scanner(System.in);
		System.out.println("\n --->Faça seu login<---");
		System.out.print("\nUsuario:");
		String logUser = entrada.next();
		System.out.print("Senha:");
		String logPass = entrada.next();
		if( logUser.equals(usuario) && logPass.equals(senha)) {
			horario();
		}else {
			System.out.println("Usuario/senha incorreta!");
		
			
		}
		
	}
}
	


