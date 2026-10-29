
//Classe

import javax.swing.JOptionPane;

public class Caixa 
{
	//Atributo
	private double saldo = 10000.00;
	
	//Método Saque
	public double Saque(double valorSaque) 
	{					
		  return saldo -= valorSaque;
	}
	
	//Método Deposito
	public double Deposito(double valorDep) 
	{
		return saldo += valorDep;
	}
	
	//Método MostrarSaldo
	public double MostrarSaldo() 
	{
		return saldo;
	}
	
	
}
