public class Cachorro {
	private String nome;
	private String raca;
	private int idade;
	private Data dataDeAdocao;
	
	public Cachorro (String novoNome, String novoRaca, int novoIdade, Data data) {
		this.nome = novoNome;
		this.raca = novoRaca;
		this.idade = novoIdade;
		this.dataDeAdocao = data;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getRaca() {
		return raca;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public Data getData() {
		return dataDeAdocao;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public void setRaca(String novoRaca) {
		this.raca = novoRaca;
	}
	
	public void setIdade(int novoIdade) {
		this.idade = novoIdade;
	}
	
	public void setData(Data data) {
		this.dataDeAdocao = data;
	}
	
	public String toString() {
		return nome.toString() + "\n" + raca.toString() + "\n" + this.idade + "\n" + dataDeAdocao.toString();
	}
	
	public String emitirSom() {
		return "Au au!";
	}
}
