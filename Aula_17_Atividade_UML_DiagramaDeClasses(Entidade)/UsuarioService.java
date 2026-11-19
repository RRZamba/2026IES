
public class UsuarioService
{
	/* Classe Responsável por 
	   manipular a entidade 'Usuario'
	*/
	
	//Método Cadastar
	public String Cadastrar(Usuario user) 
	{
		//Simulando um Insert
		return  "Usuário: " + user.getNome() + "Cadastrado";
	}
}
