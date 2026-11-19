import javax.swing.JOptionPane;

public class Principal 
{

	public static void main(String[] args) 
	{
		//"Cadastrando" o usuário
		JOptionPane.showMessageDialog(null, 
				"Olá meu chuchu!!!");
		
		//Recebendo os valores do usuário
		String nome = JOptionPane.showInputDialog(
						"Digite seu nome:");
		
		String cpf = JOptionPane.showInputDialog(
				"Digite seu CPF:");
		
		String cargo = JOptionPane.showInputDialog(
				"Digite seu cargo:");
		
		String end = JOptionPane.showInputDialog(
				"Digite seu endereço:");
		
		//Montando o "Usuário"
		Usuario user = new Usuario(nome, cpf, cargo, end);
		
		//Cadastrando o usuário
		UsuarioService userService = new UsuarioService();
		JOptionPane.showMessageDialog(null, 
				userService.Cadastrar(user));
		
		
		
		
		
		
		
				
		
	}
}
