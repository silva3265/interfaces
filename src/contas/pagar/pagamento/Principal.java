package contas.pagar.pagamento;

import contas.pagar.modelo.Holerite;
import contas.pagar.modelo.OrdemServico;

public class Principal {

	public static void main(String[] args) {
		
		MetodoPagamento metodoPagamento = new Pix();
		
        ServicoContaPagar servicoContaPagar = new ServicoContaPagar(metodoPagamento);

        Beneficiario funcionario = new Beneficiario("João da Silva", "34999998888", "456789");
        Holerite holerite = new Holerite(funcionario, 100, 168);

        Beneficiario fornecedor = new Beneficiario("Consultoria XYZ", "10687799000187", "34466");
        OrdemServico os = new OrdemServico(fornecedor, 65_500);

        servicoContaPagar.pagar(holerite);
        servicoContaPagar.pagar(os);
    }

}


