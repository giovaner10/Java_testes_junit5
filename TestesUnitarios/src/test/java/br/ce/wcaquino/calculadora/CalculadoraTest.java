package br.ce.wcaquino.calculadora;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;


public class CalculadoraTest {
    @Test
    public void somaDeDoisValores(){
        int a = 5;
        int b = 6;

        int soma = Calculadora.soma(a, b);

        assertThat(soma).isEqualTo(a+b);
        Assert.assertEquals(a+b, soma);

    }

    @Test
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
}
