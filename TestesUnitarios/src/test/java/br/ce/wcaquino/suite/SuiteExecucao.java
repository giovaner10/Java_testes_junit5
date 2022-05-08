package br.ce.wcaquino.suite;

import br.ce.wcaquino.calculadora.CalculadoraTest;
import br.ce.wcaquino.servicos.LocacaoServiceTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CalculadoraTest.class,
        LocacaoServiceTest.class
})
public class SuiteExecucao {


}
