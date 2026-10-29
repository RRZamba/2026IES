import javax.swing.JOptionPane;

//Classe
public class Principal 
{
	//Método Principal
	public static void main(String[] args) 
	{
	
		//Menu de opções para o usuário
		int opcao =  Integer.parseInt(
						JOptionPane.showInputDialog(
						"Olá meu consagrado \n " 
						+ "Escolha uma das opções abaixo:"
						+ "\n [1] - Saque"
						+ "\n [2] - Depósito"
						+ "\n [3] - Mostrar Saldo S2"));
		
		//Instanciando classe caixa
		Caixa cx = new Caixa();
		
		
		//Validando opção do usuário!!!
		switch(opcao) 
		{
			case 1:		  
				
				 //Recebendo valor de saque
				  double valorSaque = Double.parseDouble(
						     JOptionPane.showInputDialog(
						    	"Digite o valor do saque!"));
				
		  
				  //Mostrando saldo atual
				  JOptionPane.showMessageDialog(null, 
						  "Valor Atual R$ " + cx.Saque(valorSaque));
				  
				break;
			
			case 2:
				//Valor do depósito
				double valorDeposito = Double.parseDouble(
					     		JOptionPane.showInputDialog(
					    	"Digite o valor do depósito!"));
				
				//Mostrar saldo atual
				JOptionPane.showMessageDialog(null, 
						"Saldo atual R$ " + cx.Deposito(valorDeposito));
				
				 
				break;
			
			case 3:
				
				JOptionPane.showMessageDialog(null, 
						"Valor Saldo R$ " + cx.MostrarSaldo());
				 
				break;
				
			default:
				JOptionPane.showMessageDialog(null,
						"Escolha uma opção válida!!! \n meu querido!!!");
				break;
		}
	}//Método
}//Classe
