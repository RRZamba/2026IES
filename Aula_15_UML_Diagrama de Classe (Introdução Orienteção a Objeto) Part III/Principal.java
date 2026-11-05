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
		
		//Opções para o usuário
		String op = "";
		
		//Repetir até escolher [0]sair
		while(op != "0")
		{
			op = JOptionPane.showInputDialog(
					"Escolha uma opção"
				  + "\n [1] - Cadastrar"
				  + "\n [2] - Mostrar dados"
				  + "\n [3] - Situação"
				  + "\n [0] - Sair");			
			
			
			switch(op) 
			{
				case "1":
					//Pedindo valores pro usuário
					String nominho = JOptionPane.showInputDialog(
										"Digite o nome");
					String cursinho = JOptionPane.showInputDialog(
										"Digite o curso:");
					double notinha = Double.parseDouble(
								JOptionPane.showInputDialog(
										"Digite a nota:"));
				
					//"Cadastrando" o aluno
					alu.Cadastrar(nominho, cursinho, notinha);
					
					//Sucesso
					JOptionPane.showMessageDialog(null, 
							"Aluno Cadastrado com sucesso!!!");
				break;
				
				case "2":
					JOptionPane.showMessageDialog(null,
							alu.MostrarDados());
					
				break;
				
				case "3":
					if(alu.Aprovado())
					{
						JOptionPane.showMessageDialog(null, 
								"Aluno Aprovado!!!");
					}
					else
					{
						JOptionPane.showMessageDialog(null, 
								"Aluno Reprovado!!!");
					}
				break;
				
				

				default:
					JOptionPane.showMessageDialog(null, 
						"Escolha uma opção válida!!! ANIMAL!!!");
				break;
			}
			
			
		}
		
		
		
		
		
	}
}
