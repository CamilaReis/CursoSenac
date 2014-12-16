import java.util.Calendar;




public class Emprestimo extends Servico {
	
	private double valor;
	private double taxa;
	
	public Emprestimo () {
		System.out.println("Servico..........");
	}
	
	@Override
	public double calculartaxa(){
		return super.calculartaxa() + this.valor * 0.1;
		
		
	}


	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}


	public void setResponsavel(Funcionario funcionario) {
		
		
	}


	public Object getData() {
		
		return null;
	}


	public void setDataDeContratacao(Calendar instance) {
		
		
	}

}