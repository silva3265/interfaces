package contas.pagar.pagamento;

public class ServicoContaPagar {

	 private MetodoPagamento metodoPagamento; // Injeção de dependencias

	    public ServicoContaPagar(MetodoPagamento metodoPagamento) {
	        this.metodoPagamento = metodoPagamento;
	    }

	    public void pagar(DocumentoPagavel documento) {
	        // Poderia ter outras regras de negócio aqui
	        // como por exemplo registrar o pagamento no banco de dados,
	        // enviar uma notificação por e-mail, etc

	        metodoPagamento.pagar(documento);
	    }

}