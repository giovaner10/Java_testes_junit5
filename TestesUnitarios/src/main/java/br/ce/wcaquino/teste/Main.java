package br.ce.wcaquino.teste;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);


        integers.stream().map(integers::add);

       integers.stream()
              // .filter(integer -> integer > 2)
               .skip(4)
               .forEach(aBoolean -> System.out.println(aBoolean));

      /* if(integers.stream().filter(integers::add).count() != 0){
           System.out.println("resultado menor encontrado");
       }*/

    }
}
