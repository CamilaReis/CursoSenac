import java.util.Calendar;



public class Servico {

 private Cliente contratante;
 private Funcionario responsavel;
 private Calendar dataDeContrato;
 public double calculartaxa;
 
 public Servico() {
	
}
 

public Cliente getContratante() {
	return contratante;
}

public Funcionario getResponsavel() {
	return responsavel;
}

public Calendar getDataDeContrato() {
	return dataDeContrato;
}

public double calculartaxa() {
	return 10;
}
	
	
}





