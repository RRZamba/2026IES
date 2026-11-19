public class Usuario 
{
	//1) Atributos
	private String nome;
	private String cpf;
	private String cargo;
	private String endereco;
	
	//2) Método Construtor I
	public Usuario()
	{
		
	}

	//3) Método Construtor II
	public Usuario(String nome, String cpf, String cargo, String endereco) 
	{
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.cargo = cargo;
		this.endereco = endereco;
	}

	//4) Getters & Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
