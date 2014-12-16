
public class TesteControleDePonto {
	public static void main(String[] args) {
		Secretario sec = new Secretario();
		sec.setNome("Camila");
		sec.setRamal(144);
		sec.setSalario(1000);
		
		ControleDePonto control = new ControleDePonto();
		control.registraSaida(sec);
		control.registraEntrada(sec);
		
		Gerente ger = new Gerente();
		ger.setNome("tiao");
		ger.setSalario(1000);
		
		control.registraSaida(ger);
		control.registraEntrada(ger);
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
