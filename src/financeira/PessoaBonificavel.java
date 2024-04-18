package financeira;

public interface PessoaBonificavel extends ClienteFinanciavel {
	
	double calcularBonus(double percentualMetaAlcancada);

}
