import java.text.SimpleDateFormat;
import java.util.Date;


public class ControleDePonto {
	
	public void registraEntrada (Funcionario funcionario){
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date agora = new Date();
		
		System.out.println("funcionario:" +funcionario.getNome(null));
		System.out.println("data/hora" +sdf.format(agora));
		
		
	
		
	}
	
	public void registraSaida(Secretario sec){
	
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date agora = new Date();
		
		System.out.println("*********Saida*********");
		System.out.println("funcionario:" +sec.getNome(null));
		System.out.println("data/hora" +sdf.format(agora));
		

}

	public void registraSaida(Gerente ger) {
		// TODO Auto-generated method stub
		
	}
}

