
public class SeguroVeiculo extends Servico{

	private Veiculo veiculo;
	private double valorSeguroVeiculo;
	private double franquia;
	
	
	public double calculartaxa(){
		return this.calculartaxa() + this.valorSeguroVeiculo*0.5;
				}
	
	
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	public double getValorSeguroVeiculo() {
		return valorSeguroVeiculo;
	}
	public void setValorSeguroVeiculo(double valorSeguroVeiculo) {
		this.valorSeguroVeiculo = valorSeguroVeiculo;
	}
	public double getFranquia() {
		return franquia;
	}
	public void setFranquia(double franquia) {
		this.franquia = franquia;
	}
	
	

	
	}
