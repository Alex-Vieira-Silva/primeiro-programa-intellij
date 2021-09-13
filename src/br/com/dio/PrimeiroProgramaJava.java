package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroProgramaJava {
    public static void main(String[] args) {

        Gato gato = new Gato();
        gato.setNome("Sianeis");
        gato.setCor("Branca");
        gato.setIdade(3);

        System.out.println(gato.toString());


    }
}
