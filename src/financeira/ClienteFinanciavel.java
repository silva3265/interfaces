package financeira;

public interface ClienteFinanciavel {

	double calcularLimiteAprovado();
	
	double JUROS_BAIXO_RISCO = 1.0;
	double JUROS_MEDIO_RISCO = 1.0;
	double JUROS_AUTO_RISCO = 1.0;

	default double calcularJuros(double valorSolicitado) { // default method

		if (isFinanciamentoPequenoValor(valorSolicitado)) {
			return JUROS_BAIXO_RISCO;
		} else if (isFinanciamentoGrandeMedioValor(valorSolicitado)) {
			return JUROS_MEDIO_RISCO;
		}
		return JUROS_AUTO_RISCO;
	}

	static boolean isFinanciamentoGrandeMedioValor(double valorSolicitado) {
		return valorSolicitado <= 1_000_000;
	}
	
	static boolean isFinanciamentoPequenoValor(double valorSolicitado) {
		return valorSolicitado <= 100_000;
	}

}
