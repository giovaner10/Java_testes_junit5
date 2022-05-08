package br.ce.wcaquino.teste;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainPessoa {
    public static void main(String[] args) {
        List<Pessoa> pessoas = Pessoa.bancoDePessoas();

        List<String> stringStream = pessoas.stream()
                .filter(pessoa -> pessoa.getIdade() < 25)
                .sorted(Comparator.comparing(Pessoa::getNome))
                .limit(3)
                .map(Pessoa::getNome)
                .collect(Collectors.toList());

        stringStream.forEach(System.out::println);

    }
}
