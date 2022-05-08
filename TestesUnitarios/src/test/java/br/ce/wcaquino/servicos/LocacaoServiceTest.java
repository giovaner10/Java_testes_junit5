package br.ce.wcaquino.servicos;

import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.Locacao;
import br.ce.wcaquino.entidades.Usuario;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import br.ce.wcaquino.exceptions.FilmeSemEstoqueException;
import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.rules.ErrorCollector;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.List;

public class LocacaoServiceTest {

    @Rule
    public ErrorCollector errorCollector = new ErrorCollector();
    @Rule
    public ExpectedException expectedException = ExpectedException.none();
    private LocacaoService locacaoService;

    @BeforeEach
    public void setUp() throws Exception {
         locacaoService = new LocacaoService();
    }

    @Test
    public void teste() {

        //cenario
        LocacaoService service = new LocacaoService();

        //acao
        Locacao locacao = null;
        try {
            locacao = service.alugarFilme(new Usuario(), List.of(new Filme("giovane", 1, 2.0)));
            assertTrue(locacao.getDataLocacao() != null);

            assertFalse(locacao.getDataLocacao() == null);

            Usuario usuario = new Usuario("mesmo");
            Usuario usuario1 = new Usuario("mesmo");
            Usuario usuario2 = null;

            errorCollector.checkThat(usuario, equalTo(usuario1));
            assertNull(usuario2);
            errorCollector.checkThat(5, equalTo(5));
        } catch (Exception e) {
            e.printStackTrace();
            fail("nao deveria lancar essa excessao");
        }

        //verificacao


    }


    @Test(expected = Exception.class)
    public void teste_filmeSemEstoque() throws Exception {

        //cenario
        LocacaoService service = new LocacaoService();

        //acao
        Locacao locacao = null;
        locacao = service.alugarFilme(new Usuario(),List.of(new Filme("giovane", 0, 2.0)));


    }

    @Test
    public void teste_filmeSemEstoque2() {

        //cenario
        LocacaoService service = new LocacaoService();

        //acao
        Locacao locacao = null;
        try {
            locacao = service.alugarFilme(new Usuario(), List.of(new Filme("giovane", 0, 2.0)));
        } catch (Exception e) {
            assertThat(e.getMessage(), is("estoque insuficiente"));
        }


    }


    @Test
    public void teste_filmeSemEstoque3()  {

        //cenario
        LocacaoService service = new LocacaoService();
        //expectedException.expect(FilmeSemEstoqueException.class);

        Assertions.assertThrows(FilmeSemEstoqueException.class, ()-> service.alugarFilme(new Usuario(), List.of(new Filme("giovane", 0, 2.0))));
        //acao
       // Locacao locacao = service.alugarFilme(new Usuario(), new Filme("giovane", 0, 2.0));

    }

    @Test
    public void teste_filmeSemEstoque4()  {

        LocacaoService service = new LocacaoService();

        Assertions.assertThrows(FilmeSemEstoqueException.class, ()-> service.alugarFilme(null, List.of(new Filme("giovane", 0, 2.0))));


    }
}