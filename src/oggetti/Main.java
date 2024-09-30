package oggetti;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Auto a = new Auto("fiat","punto",-1);
        Auto b = new Auto("ford", "fiesta", 10000);
        Auto c = new Auto("porsche", "panamera",90000);
        Auto d = new Auto("ferrari", "testarossa", 700000);

        String marca=a.getMarca();
        String modello=a.getModello();
        double prezzo=a.getPrezzo();
        System.out.println("Marca: "+ marca);
        System.out.println("Modello: "+ modello);
        System.out.println("Prezzo "+ prezzo);
        System.out.println(" ");

        marca=b.getMarca();
        modello=b.getModello();
        prezzo = b.getPrezzo();
        System.out.println("Marca: "+ marca);
        System.out.println("Modello: "+ modello);
        System.out.println("Prezzo "+ prezzo);
        System.out.println(" ");

        marca=c.getMarca();
        modello=c.getModello();
        prezzo = c.getPrezzo();
        System.out.println("Marca: "+ marca);
        System.out.println("Modello: "+ modello);
        System.out.println("Prezzo "+ prezzo);
        System.out.println(" ");

        marca=d.getMarca();
        modello=d.getModello();
        prezzo = d.getPrezzo();
        System.out.println("Marca: "+ marca);
        System.out.println("Modello: "+ modello);
        System.out.println("Prezzo "+ prezzo);
        System.out.println(" ");

        d.setPrezzo(-10);
        System.out.println(d.getPrezzo());

    }
}