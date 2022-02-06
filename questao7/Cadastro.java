package questao7;

import java.util.Scanner;

//Faz o cadastro e guarda seus dados
public class Cadastro extends Login{
	protected static String usuario;
	protected static  String senha;
	
	public static void main(String[] args) {
		
	
		Cadastro teste = new Cadastro();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Olá ---- Seja bem vindo(a) ---- Por favor faça seu cadastro");
		System.out.print("Digita seu usuario:");
		String usuario = input.next();
		System.out.print("Digita sua senha:");
		String senha = input.next();
		Logar( usuario, senha);
		String usuarioArray[] = {usuario};
		String senhaArray[] = {senha};
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		 this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}


}
