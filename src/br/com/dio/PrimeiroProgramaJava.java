package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroProgramaJava {
    public static void main(String[] args) {

       /* int a = 2;
        int b = 6;

        System.out.println("Hello World! " + (a+b));*/

        Gato gato = new Gato();
        gato.setNome("Sianeis");
        gato.setCor("Branca");
        gato.setIdade(3);

        System.out.println(gato.toString());


    }
}
