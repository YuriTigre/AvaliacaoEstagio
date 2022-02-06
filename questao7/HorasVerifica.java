	package questao7;
import java.text.SimpleDateFormat;
import java.util.Date;

//Verifica em que horario o usario entrou no sistema e imprime na tela
public class HorasVerifica{
	public static void horario() {	
		Date data = new Date();
		SimpleDateFormat time = new SimpleDateFormat("HH:mm");
		String tempo = time.format(data);
		
		if(tempo.compareTo("06:00") >= 1 &&	tempo.compareTo("11:59") <= -1 ){
			
			System.out.println("\nBom dia, você se logou ao nosso sistema.");
		}
		if(tempo.compareTo("12:00") >= 1 && tempo.compareTo("17:59") <= -1 ){
			
			System.out.println("\nBoa tarde, você se logou ao nosso sistema.");
		}
		if(tempo.compareTo("18:00") >= 1 && tempo.compareTo("23:59") <= -1 ){
		
			System.out.println("\nBoa noite, você se logou ao nosso sistema.");
		}else if(tempo.compareTo("00:00") >= 1 && tempo.compareTo("05:59") <= -1 ){
			
			System.out.println("\nBoa madrugada, você se logou ao nosso sistema.");
		}
		

	}
	
}
