 package questao8;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Entrada{
	private String funcionario;
	//Tentativa de criar classes atraves da quantidade inserida pelo usuario
	public static void main(String[] args) {
		String arrayFunc[] = null;
		Entrada func = new Entrada();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digita a quantidade de funcionarios:");
		String funcionarios = input.next(); 
		int inteiro = Integer.parseInt(funcionarios);
		Scanner entrada = new Scanner(System.in);
		System.out.print("Nome do funcionário:");
		String nomeFunc = entrada.next();
		System.out.print("Nome do funcionário:");
		String salario = entrada.next();
		save(nomeFunc, inteiro);
		
		}
	//tentativa de salvar os nomes em um metodo
	public static void save(String something, int inteiro) {
		for(int i= 0; i <inteiro ; i++) {
		String[] teste = new String[i];
		teste[i] += something;
	}
		System.out.println(something);
	}
	public String getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(String funcionario) {
		this.funcionario = funcionario;
	}
}


