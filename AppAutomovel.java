import model.Automovel;

public class AppAutomovel {
    public static void main(String[] args) throws InterruptedException {
       
      Automovel automovel = new Automovel();
      automovel.setMarca_carro("BMW");
      automovel.setNome_piloto("pedoca");
      automovel.setModelo_carro("i8");

      
        automovel.imprimirInfos();

    }
    
}