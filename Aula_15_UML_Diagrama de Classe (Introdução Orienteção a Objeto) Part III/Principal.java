import javax.swing.JOptionPane;


//Classe
public class Principal 
{
	//Método main
	public static void main(String[] args) 
	{
		//Mensagem de boas vindas
		JOptionPane.showMessageDialog(null,"Bom dia fofura!!!");
		
		//Instanciando a classe Aluno
		Aluno alu = new Aluno();
		
		//Testando o met. Cadastrar
		alu.Cadastrar("Camila","Ballet", 10);
		
		//mét. MostrarDados 
		JOptionPane.showMessageDialog(null, 
						alu.MostrarDados());
		
		//Mét. Aprovado
		JOptionPane.showMessageDialog(null,
						alu.Aprovado());
		
		
		
		
		
	}
}
