package contas.pagar.pagamento;

public interface DocumentoPagavel {

	public abstract double getValorTotal(); // todo documento pagavel precisa ter esse metodo como contrato

	Beneficiario getBeneficiario();

}
 