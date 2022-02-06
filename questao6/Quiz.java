package questao6;
import java.util.Scanner;

public class Quiz {
	//Guarda as perguntas e respostas, e mostra na tela.E utiliza o ComparaResposta 
	//para mostrar se acertou ou errou.
	
	public void quizup() {
		String pergunta1 = "Perguta 1- Quais dessas músicas pertence ao Lagum?";
		System.out.println(pergunta1);
		System.out.println("A) Fica ");
		System.out.println("B) Tarde Livre ");
		System.out.println("C) Telefone ");
		System.out.println("D) Eu Me Lembro ");
		Scanner scan = new Scanner(System.in);
		System.out.print("Sua resposta:");
		String resposta1 = scan.next();
		ComaparaResposta r1 = new ComaparaResposta();
		r1.Resposta(resposta1.toUpperCase(), "C");
		
		String pergunta2 = "Perguta 2- Quais dessas músicas pertence ao Joji?";
		System.out.println(pergunta2);
		System.out.println("A) Slow Dancing in the rain ");
		System.out.println("B) 777 ");
		System.out.println("C) Give Love ");
		System.out.println("D) Pretty Girl ");
		Scanner scan2 = new Scanner(System.in);
		System.out.print("Sua resposta:");
		String resposta2 = scan.next();
		ComaparaResposta r2 = new ComaparaResposta();
		r1.Resposta(resposta2.toUpperCase(), "B");
		
		String pergunta3 = "Perguta 3- Quais dessas músicas pertence aos Beatles?";
		System.out.println(pergunta3);
		System.out.println("A) Hey Jude");
		System.out.println("B) Hello!");
		System.out.println("C) In my live ");
		System.out.println("D) Bluebird ");
		Scanner scan3 = new Scanner(System.in);
		System.out.print("Sua resposta:");
		String resposta3 = scan.next();
		ComaparaResposta r3 = new ComaparaResposta();
		r1.Resposta(resposta3.toUpperCase(), "A");
		
		String pergunta4 = "Perguta 4- Quais dessas músicas pertence a banda The Strokes?";
	    System.out.println(pergunta4);
		System.out.println("A) Someplace ");
		System.out.println("B) Welcome To New York ");
		System.out.println("C) 30/30 ");
		System.out.println("D) Call me Back ");
		Scanner scan4 = new Scanner(System.in);
		System.out.print("Sua resposta:");
		String resposta4 = scan.next();
		ComaparaResposta r4 = new ComaparaResposta();
		r1.Resposta(resposta4.toUpperCase(), "D");
		
		String respostaArray[] = {resposta1,resposta2,resposta3,resposta4};
		String perguntaArray[] = {pergunta1,pergunta2, pergunta3, pergunta4};
		
	}
	
}

	


	

