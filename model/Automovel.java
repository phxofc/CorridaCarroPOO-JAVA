package model;

public class Automovel{

    String nome_piloto;
    String marca_carro;
    String modelo_carro;
    String distancia_pecorrida;

    public Automovel(String distancia_pecorrida, String marca_carro, String modelo_carro, String nome_piloto) {
        this.distancia_pecorrida = distancia_pecorrida;
        this.marca_carro = marca_carro;
        this.modelo_carro = modelo_carro;
        this.nome_piloto = nome_piloto;
    }

    public Automovel() {
    }

    public String getNome_piloto() {
        return nome_piloto;
    }

    public void setNome_piloto(String nome_piloto) {
        this.nome_piloto = nome_piloto;
    }

    public String getMarca_carro() {
        return marca_carro;
    }

    public void setMarca_carro(String marca_carro) {
        this.marca_carro = marca_carro;
    }

    public String getModelo_carro() {
        return modelo_carro;
    }

    public void setModelo_carro(String modelo_carro) {
        this.modelo_carro = modelo_carro;
    }

    public String getDistancia_pecorrida() {
        return distancia_pecorrida;
    }

    public void setDistancia_pecorrida(String distancia_pecorrida) {
        this.distancia_pecorrida = distancia_pecorrida;
    }
    

    public void imprimirInfos(){
        System.out.println("Marca: "+ marca_carro);
        System.out.println("Piloto: "+ nome_piloto);

    }
    
}