package contas_pagar;

public class Principal {

    public static void main(String[] args) {
        ServicoContaPagar servicoContaPagar = new ServicoContaPagar();

        // TODO Precisamos instanciar um objeto de uma classe que implemente a interface
        DocumentoPagavel documento = null;

        servicoContaPagar.pagar(documento);
    }

}


