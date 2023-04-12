package RentACar;

import java.util.ArrayList;
import java.util.List;

public class Rent {
    public static final String White = "\u001B[37m";
    public static final String Red = "\u001B[31m";
    public static final String Green = "\u001B[32m";
    public static final String Yellow = "\u001B[33m";
    public static final String Blue = "\u001B[34m";
      static List<Cars> carList = new ArrayList<>();
    static List<String > musteriIsim = new ArrayList<>();
    static List<String > musteriSoyisim = new ArrayList<>();
    static List<Integer> musteriId = new ArrayList<>();




    Cars mercedes= new Cars("Mercedes","C200","Dizel","Otomatik",1000);
    Cars bmw= new Cars("BMW","520","Dizel","Otomatik",1000);
    Cars ford= new Cars("Ford","Focus","Benzin","Manuel",500);
    Cars opel=new Cars("Opel","Vectra","Gaz","Manuel",400);


    public static void araba() {

        Cars audi= new Cars("Audi","A8","Dizel","Otomatik",1000);
        Cars bmw= new Cars("BMW","520","Dizel","Otomatik",1000);
        Cars ford= new Cars("Ford","Focus","Benzin","Manuel",500);
        Cars opel=new Cars("Opel","Vectra","Gaz","Manuel",400);

        carList.add(audi);
        carList.add(bmw);
        carList.add(ford);
        carList.add(opel);
        System.out.println(audi.marka);

    }


}
