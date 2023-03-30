import me.dio.web.desafio.fabricaCarros.Carro;
import me.dio.web.desafio.fabricaCarros.CarroEsportivo;
import me.dio.web.desafio.fabricaCarros.CarroPopular;
import me.dio.web.desafio.fabricaCarros.Fabrica;

public class Main {

    public static void main(String[] args) {


        CarroPopular carroPopular1 = new CarroPopular("Gol", "Preto", 60000, 1.0,4);
        CarroPopular carroPopular2 = new CarroPopular("Fusca", "Azul", 103000, 2.0,2);
        CarroEsportivo carroEsporte1 = new CarroEsportivo("Beetle R-Line", "Vermelho", 220000, 200,224);
        CarroEsportivo carroEsporte2 = new CarroEsportivo("Golf GTI", "Prata",180000 , 333,270);

        Fabrica volkswagen = new Fabrica();
        volkswagen.fabricarCarro(carroPopular1);
        volkswagen.fabricarCarro(carroPopular2);
        volkswagen.fabricarCarro(carroEsporte1);
        volkswagen.fabricarCarro(carroEsporte2);
        volkswagen.listaCarros();
        System.out.println("\nQuantidade de carros em estoque: " + volkswagen.getQuantidadeCarros());

        Carro carroEsporte3 = new CarroEsportivo("Test", "Test",10000 , 10,10);
        volkswagen.fabricarCarro(carroEsporte3);



    }
}
