
public class Vendedor extends Funcionario {
	private double comissao;
	
	@Override
	public double bonificacao(){
		return this.getSalario() + comissao;
		
	}

	
	
	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

}
