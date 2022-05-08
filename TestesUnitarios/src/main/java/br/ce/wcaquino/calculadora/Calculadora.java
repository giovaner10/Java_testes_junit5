package br.ce.wcaquino.calculadora;

import br.ce.wcaquino.exceptions.NaoPodeDividirPorZeroException;

public class Calculadora {



    public static int soma(int a, int b){
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int dividir(int a, int b) {
        if (b == 0){
            throw new NaoPodeDividirPorZeroException();
        }
        return a / b;
    }
}
