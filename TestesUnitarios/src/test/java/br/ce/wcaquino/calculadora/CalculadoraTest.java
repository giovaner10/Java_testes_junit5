package br.ce.wcaquino.calculadora;

import br.ce.wcaquino.exceptions.NaoPodeDividirPorZeroException;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import static org.assertj.core.api.Assertions.*;


public class CalculadoraTest {
    public ExpectedException expectedException = ExpectedException.none();


    @Test
    public void somaDeDoisValores(){
        int a = 5;
        int b = 6;

        int soma = Calculadora.soma(a, b);

        assertThat(soma).isEqualTo(a+b);
        Assert.assertEquals(a+b, soma);

    }

    @Test
    @Ignore
    public void subtrairDoisValores(){
        int a = 5;
        int b = 6;

        int soma = Calculadora.subtrair(a, b);

        assertThat(soma).isEqualTo(a-b);
        Assert.assertEquals(a-b, soma);

    }

    @Test
    public void dividirDoisValores(){
        int a = 4;
        int b = 2;

        int soma = Calculadora.dividir(a, b);

        assertThat(soma).isEqualTo(a/b);
        Assert.assertEquals(a/b, soma);

    }

    @Test
    public void dividirDoisValoresBaseZeroException() throws NaoPodeDividirPorZeroException{
        int a = 4;
        int b = 0;

        //expectedException.expect(NaoPodeDividirPorZeroException.class);


        //assertj e junit5
        Assertions.assertThatThrownBy(()->Calculadora.dividir(a, b)).isInstanceOf(NaoPodeDividirPorZeroException.class);
        org.junit.jupiter.api.Assertions.assertThrows(NaoPodeDividirPorZeroException.class,()-> Calculadora.dividir(a,b));


    }
}
