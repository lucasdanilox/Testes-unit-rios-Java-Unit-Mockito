import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PilhaTestFixture extends Pilha {

    private Pilha pilha;

    @Before
    public void setUp() {
        pilha = new Pilha();
        System.out.println("Executou o @BeforeEach");

        Livro livro1 = new Livro("A Terra");
        Livro livro2 = new Livro("A Lua");
        Livro livro3 = new Livro("A Piramide");
        Livro livro4 = new Livro("A Volta");
        Livro livro5 = new Livro("O Sol");

        pilha.push(livro1);
        pilha.push(livro2);
        pilha.push(livro3);
        pilha.push(livro4);
        pilha.push(livro5);

    }

    @After
    public void tearDown() {
        System.out.println("Executou o @AfterEach");

        int tamanho = pilha.count();

        while (tamanho > 0) {
            pilha.pop();
            tamanho--;
        }
    }


    @Test
    public void testNaoAdicionaAlemLimite() {

        try {
            pilha.push(new Livro("A Volta"));
            fail();
        } catch (ArrayStoreException e) {
            assertTrue(true);
        }

        System.out.println("executou testNaoAdicionaAlemLimite");

    }

    @Test(expected = ArrayStoreException.class)
    public void testNaoAdicionaAlemLimiteException(){

        pilha.push(new Livro("A Volta 2"));

        System.out.println("Executou Este Metodo");

    }

    @Test
    public void testNaoAdicionaLivroForaPadraoNome() {
        try {
            pilha.push(new Livro("Não Valido"));
            fail();

        } catch (ArrayStoreException e) {
            assertTrue(true);
        }

        System.out.println("executou testNaoAdicionaForaPadraoNome");

    }
}