import java.text.SimpleDateFormat;
import java.util.Calendar;


public class GeradorExtrato {
	
	public void imprimirExtrato (Conta conta){
		
		SimpleDateFormat formatardata = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Calendar agora = Calendar.getInstance();
		
		System.out.println("Saldo" +Conta.getSaldo()+ "-" +formatardata.format(agora.getTime()));
	}

}
