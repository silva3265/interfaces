package financeira;

public class Principal2 {

	public static void main(String[] args) {
//      ClienteFinanciavel funcionario = new Funcionario("João da Silva", 18_000);
//      funcionario.calcularBonus(80);

//      Fazenda fazenda = new Fazenda("Fazenda Dona Benedita", 1_000_000, 5);
//      fazenda.calcularBonus(80);

//      PessoaBonificavel funcionario = new Funcionario("João da Silva", 18_000);
//      funcionario.calcularBonus(80);

		Funcionario funcionario = new Funcionario("João da Silva", 18_000);
//      funcionario.calcularBonus(80);

		ServicoPagamentoBonus servicoPagamentoBonus = new ServicoPagamentoBonus();
		servicoPagamentoBonus.pagar(funcionario, 100);
	}

}
