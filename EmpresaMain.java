public class EmpresaMain {

	public static void main(String[] args) {
		Empresa ref = new Empresa("HobbyX", "33.000.167/0001-01", new Data(12, 02, 2024), new Endereco("Rua Alberto Freire", "Galeria Blue", "Boa Viagem", "Recife", "Pernambuco", "54622-187", 133));
			System.out.println(ref.toString());
	}

}
