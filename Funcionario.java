public class Funcionario {
	
	private String nome;
	private int idade;
	private double altura;
	private Data data;
	private Endereco endereco; 

	
	public Funcionario(String n, int i, double a, Data d, Endereco e) {
		this.nome = n;
		this.idade = i;
		this.altura = a;
		this.data = d;
		this.endereco = e;
	}
	
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public double getAltura() {
		return altura;
	}
	public Data getData() {
		return data;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setNome (String n) {
		this.nome = n;
	}
	public void setIdade (int i) {
		this.idade = i;
	}
	public void setAltura (double a) {
		this.altura = a;
	}
	public void setData (Data d) {
		this.data = d;
	}
	public void setEndereco (Endereco e) {
		this.endereco = e;
	}
	
	public String toString() {
		return nome.toString() + "\n" + this.idade + "\n" + this.altura + "\n" + data.toString() + "\n" + endereco.toString();
		
	}
}
