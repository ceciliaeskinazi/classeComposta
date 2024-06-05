public class FuncionarioMain {

	public static void main(String[] args) {
		Funcionario ref = new Funcionario("CecÍlia", 17, 1.63, new Data(20, 8, 2006), new Endereco("Rua Cristine Albert", "casa 76", "Aldeia", "Camaragibe", "Pernambuco", "54783-170", 803));
			System.out.println(ref.toString());

	}
