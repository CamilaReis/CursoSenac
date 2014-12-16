import java.util.Calendar;


public class TestarGeradorExtrado {

	public static void main(String[] args) {
		GeradorExtrato ge = new GeradorExtrato();
		
		Calendar dataAniversario = Calendar.getInstance();
		dataAniversario.set(1996, 10,26);
		
		ContaPoupança p = new ContaPoupança();
		p.setSaldo(5000);
		p.setDataAniversario(dataAniversario);

		ContaCorrente cc = new ContaCorrente();
		cc.setLimite(200);
		cc.setSaldo(1000);
		
		//IMPRIMINDO EXTRATO DA POUPANCA
		ge.imprimirExtrato(p);
		
		//IMPRIMINDO EXTRATO DA conta corrente
		ge.imprimirExtrato(cc);
		
	}

}
