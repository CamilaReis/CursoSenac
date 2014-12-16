
public class Gerente extends Funcionario {
	private String Login;
	private String Senha;
	
	
	public double bonificacao(){
		return this.getSalarario() + 0.2;
		
		
		
	}
	public String getLogin() {
		return Login;
	}
	public void setLogin(String login) {
		Login = login;
	}
	public String getSenha() {
		return Senha;
	}
	public void setSenha(String i) {
		Senha = i;
	}
	public void setNome(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setSenha(int i) {
		// TODO Auto-generated method stub
		
	}

}
	
