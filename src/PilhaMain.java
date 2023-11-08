public class PilhaMain {
    public static void main(String[] args) {
        PilhaTest teste = new PilhaTest();
        boolean resultado;

        resultado = teste.testeNaoAdicionaLivroAlemLimite();
        System.out.println("Teste Limite: " + resultado);

        resultado = teste.testeRetiraUltimoLivro();
        System.out.println("Teste Retirar Ultimo Livro: " + resultado);

        resultado = teste.testNaoAdicionaLivroForaPadraoNome();
        System.out.println("Teste Não Adiciona Livro Fora Do Padrao De Nome: " + resultado);
    }

}
