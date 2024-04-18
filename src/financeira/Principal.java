package financeira;

public class Principal {

	public static void main(String[] args) {
		var servicoFinanciamento = new ServicoFinanciamento();
		var fazenda = new Fazenda("Fazenda Dona Benedita", 5_000_000, 5);
		var industria = new Industria("Alimentos da Vovó", 900_000, true);
		var funcionario = new Funcionario("João da silva", 18_000);
		
		//System.out.println(ClienteFinanciavel.isFinanciamentoGrandeMedioValor(500_00)); // chamando o metodo estatico

		System.out.printf("Juros baixo risco: %.2f%n", ClienteFinanciavel.JUROS_BAIXO_RISCO);
		
		//servicoFinanciamento.solicitarFinanciamento(funcionario, 90_000);
		servicoFinanciamento.solicitarFinanciamento(fazenda, 600_000);
		servicoFinanciamento.solicitarFinanciamento(industria, 500_000);
	}

}
