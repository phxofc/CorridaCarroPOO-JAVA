
import model.Automovel;


public class AppAutomovel {
    public static void main(String[] args) throws InterruptedException {
       

      Automovel[] carro = new Automovel[2];
      carro[0] = new Automovel("PH", "JEEP", "COMPASS");
      carro[1] = new Automovel("MS", "CIVIC", "G10");

      boolean corridaFinalizada = false;
        
        while (!corridaFinalizada) {
            Automovel.imprimirBarreira();

            for (int i = 0; i < carro.length; i++) {
                carro[i].imprimeCarro();
            }

            Automovel.imprimirBarreira();

            for (int i = 0; i < carro.length; i++) {
                carro[i].imprimeDistancia();
            }

            if (carro[0].getDistancia_pecorrida() >= 120 || carro[1].getDistancia_pecorrida() >= 120) {
                corridaFinalizada = true;
            }
            // delay para fazer o efeito de movimento
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // condições para vitoria ou empate 
        }
        if (carro[0].getDistancia_pecorrida() >= 120 && carro[1].getDistancia_pecorrida() >= 120) {
            System.out.println("EMPATE!");
        } else if (carro[0].getDistancia_pecorrida() >= 120) {
            System.out.println("Piloto 1 (" + carro[0].getDistancia_pecorrida() + ") GANHOU!");
        } else {
            System.out.println("Piloto 2 (" + carro[1].getDistancia_pecorrida() + ") GANHOU!");
        }
        

    }
    
}