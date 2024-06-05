public class Empresa {
	private String nome;
	private String cnpj;
	private Data dataDeCriacao;
	private Endereco endereco;
	
	public Empresa(String novoNome, String novoCnpj, Data dataDeCriacao, Endereco endereco) {
		this.nome = novoNome;
		this.cnpj = novoCnpj;
	}

	public String getNome() {
		return nome;
	}
	public String getCnpj() {
		return cnpj;
	}

	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public String toString() {
		return nome.toString() + "\n" + cnpj.toString() + "\n" + dataDeCriacao.toString() + "\n" + endereco.toString();
	}
}
