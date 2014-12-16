


public class TestaFuncionario {
	public static void main(String[] args) {
		
		Secretario s = new Secretario();
		
		s.setNome("mary");
		s.setRamal(208);
		s.setSalario(800);
		
		Gerente g = new Gerente();
		g.setNome("joao paulo");
		g.setLogin("joao");
		g.setSenha(555);
		g.setSalario(1000);
		
		Vendedor v = new Vendedor();
		v.getNome("gato");
		v.setComissao(1000);
		
		System.out.println("funcionario" );
		
		
		
	}
	
	
	
	
	
	
	

}
