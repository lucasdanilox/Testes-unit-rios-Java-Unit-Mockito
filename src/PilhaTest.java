
public class PilhaTest {

    Pilha pilha = new Pilha();

    public boolean testeRetiraUltimoLivro() {

        Livro livro = new Livro("A Fortaleza");
        pilha.push(livro);

        livro = new Livro("A Emboscada");
        pilha.push(livro);

        livro = new Livro("O Naufrago");
        pilha.push(livro);

        String resultadoEsperado = "O Naufrago";

        return pilha.pop().getTitulo().equals(resultadoEsperado);
    }

    public boolean testeNaoAdicionaLivroAlemLimite() {
        Pilha pilha = new Pilha();

        Livro livro1 = new Livro("A fortaleza1");
        Livro livro2 = new Livro("A fortaleza2");
        Livro livro3 = new Livro("A fortaleza3");
        Livro livro4 = new Livro("A fortaleza4");
        Livro livro5 = new Livro("A fortaleza5");
        Livro livro6 = new Livro("A fortaleza6");

        pilha.push(livro1);
        pilha.push(livro2);
        pilha.push(livro3);
        pilha.push(livro4);
        pilha.push(livro5);
        pilha.push(livro6);

        String resultadoEsperado = "A fortaleza5";

        return pilha.pop().getTitulo().equals(resultadoEsperado);

    }

    public boolean testNaoAdicionaLivroForaPadraoNome() {
        Pilha pilha = new Pilha();
        Livro livro = new Livro("A Fortaleza");
        pilha.push(livro);
        Livro livro2 = new Livro("Homem de Ferro");
        pilha.push(livro2);

        String resultadoEsperado = "A Fortaleza";

        return pilha.pop().getTitulo().equals(resultadoEsperado);
    }


}
