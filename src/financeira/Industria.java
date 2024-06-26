package financeira;

public class Industria extends EmpresaFinanciavel{

	public static final double PERCENTUAL_FATURAMENTO_LIMITE_CREDITO = 0.5;
	public static final double TAXA_ACRESCIMO_LIMITE_INDUSTRIA_SUSTENTAVEL = 1.2;

	private boolean compensaEmissaoCo2;

	public Industria(String razaoSocial, double totalFaturamento, boolean compensaEmissaoCo2) {
		super(razaoSocial, totalFaturamento);
		this.compensaEmissaoCo2 = compensaEmissaoCo2;
	}

	public boolean isCompensaEmissaoCo2() {
		return compensaEmissaoCo2;
	}

	public void setCompensaEmissaoCo2(boolean compensaEmissaoCo2) {
		this.compensaEmissaoCo2 = compensaEmissaoCo2;
	}

	@Override
	public double calcularLimiteAprovado() { // Implementamos ele seguindo a regra da Industria
		double valorAprovado = getTotalFaturamento() * PERCENTUAL_FATURAMENTO_LIMITE_CREDITO;

		if (isCompensaEmissaoCo2()) {
			valorAprovado *= TAXA_ACRESCIMO_LIMITE_INDUSTRIA_SUSTENTAVEL;
		}

		return valorAprovado;
	}
	
	@Override
	public double calcularJuros(double valorSolicitado) {
		return 5.0;
	}

}
