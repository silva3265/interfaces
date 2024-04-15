package financeira;

public abstract class EmpresaFinanciavel extends Empresa implements ClienteFinanciavel{

	public EmpresaFinanciavel(String razaoSocial, double totalFaturamento) {
		super(razaoSocial, totalFaturamento);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double calcularJuros(double valorSolicitado) {
		
		return 0.8;

	}

	
}
