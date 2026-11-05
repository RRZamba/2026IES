// Classe
public class Aluno 
{
	//Atributos
	private String nome;
	private String curso;
	private double nota;
	
	//Método Cadastrar
	public void Cadastrar(String nome,String curso, double nota) 
	{
		//Salvando valores nos atributos
		this.nome = nome;
		this.curso = curso;
		this.nota = nota;		
	}
	
	//Método MostrarDados
	public String MostrarDados() 
	{
		//Var. para a mensagem
		String mens = "Nome: " + this.nome 
				    + "\n  Curso: " + this.curso
				    + "\n Nota: " + this.nota;
		
		return mens;
	}
	
	//Método Aprovado
	public boolean Aprovado() 
	{
		//Média 6 é aprovado
		if(this.nota >= 6)
		{
			return true;
		}
		else
		{
			return false;
		}		
	}

}
