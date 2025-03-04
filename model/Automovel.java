package model;

import java.util.Random;

public class Automovel{

    String nome_piloto;
    String marca_carro;
    String modelo_carro;
    int distancia_pecorrida =0;

    Random random = new Random();

    public Automovel(String marca_carro, String modelo_carro, String nome_piloto) {
        this.distancia_pecorrida = distancia_pecorrida;
        this.marca_carro = marca_carro;
        this.modelo_carro = modelo_carro;
        this.nome_piloto = nome_piloto;
    }

    public Automovel() {
    }



public void imprimeCarro() {
        int numeroSorteado = random.nextInt(3) + 1;

        distancia_pecorrida += numeroSorteado;

        String espacoSoma = " ".repeat(distancia_pecorrida);

        System.out.print(
                espacoSoma + "       _______      \n" +
                        espacoSoma + "     //  ||\\ \\     \n" +
                        espacoSoma + " ___//___||_\\ \\___ \n" +
                        espacoSoma + "|    _ " + nome_piloto + "     _  )\n" +
                        espacoSoma + "|___/ \\________/ \\_|\n" +
                        espacoSoma + "    \\_/        \\_/   \n"
        );

        System.out.println(" ");
    }

public static void imprimirBarreira() {
        System.out.println("============================================================================================================================================X");
    }


  public void imprimeDistancia() {
        System.out.println(nome_piloto + " - " + marca_carro + " " + modelo_carro + " | distancia percorrida: " + distancia_pecorrida);
    }






    public String getNome_piloto() {
        return nome_piloto;
    }

    public int getDistancia_pecorrida() {
        return distancia_pecorrida;
    }




  
}