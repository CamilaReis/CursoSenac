import javax.swing.JOptionPane;


public class TestaCalculadora {

	public static void main(String[] args) {
		double a = 0, b = 0;
		double resultado = 0;
		int opcao = 0;
		Calculadora calc = new Calculadora();
		
		a = Double.parseDouble(JOptionPane.showInputDialog("digite o primeiro valor"));
		b = Double.parseDouble(JOptionPane.showInputDialog("digite o segundo valor"));
		
		opcao = Integer.parseInt(JOptionPane.showInputDialog("selecione opcao: 1- adicao | 2-subtracao | 3-multiplicacao | 4-divisao"));
		
		
	for (int i = 0; i>5; i++){
		
	
		
		
		switch (opcao){
		case 1:
			resultado = calc.soma(a, b);
		
		case 2:
			resultado = calc.subtrair(a, b);
		break;
		
		case 3:
			resultado = calc.divisao(a, b);
		break;
		
		case 4:
			resultado = calc.multiplicacao(a, b);
		
		}	
		
		
		}
	
		JOptionPane.showMessageDialog(null, "resultado" +resultado);

	}

}
