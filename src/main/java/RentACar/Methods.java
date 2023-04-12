package RentACar;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Random;
import java.util.Scanner;

import static RentACar.Rent.*;


public class Methods {
    static Cars alisTarih = new Cars();
    static Scanner scan = new Scanner(System.in);
    public static DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    static Random rd = new Random();
    static int id;
    static String tarihAlis;
    static LocalDate alis;
    static LocalDate teslim;

    static LocalDateTime now;
    static long gun;
    static int carIndex;


    private static void musteriolustur() {
        System.out.println("Isim giriniz");
        musteriIsim.add(scan.next());
        System.out.println("Soyisim giriniz");
        musteriSoyisim.add(scan.next());
        id = rd.nextInt(100);
        musteriId.add(id);
        gun = ChronoUnit.DAYS.between(alis, teslim);

        System.out.println("Sayin " + musteriIsim.get(musteriId.indexOf(id)).toUpperCase() +
                " " + musteriSoyisim.get(musteriId.indexOf(id)).toUpperCase() +
                " toplam " + gun + " gun kiralama yaptiniz. \nOdemeniz gereken tutar =" +
                (carList.get(carIndex).getFiyat() * gun) + "TL" +
                "\n1 - Odeme Ekranina gec \n2 - Iptal et ");

        int secim1 = scan.nextInt();
        switch (secim1) {
            case 1:
                odeme();
                break;
            case 2:
                System.out.println("islemleriniz iptal edilmistir.");
                calistir();
                break;
        }

    }

    private static void odeme() {
        System.out.println("*****Odeme Ekrani***** \n Odemeniz gereken tutar = " +
                (carList.get(carIndex).getFiyat() * gun));
        System.out.println("Kart No giriniz");
        String kartNo = scan.next();
        if (kartNo.length() != 16) {
            System.out.println("Hatali giris yaptiniz");
            odeme();
        }
        System.out.println("Odemeniz basari ile gerceklesti");
        calistir();

    }

    public static void alisYil() {
        System.out.println(Red + "****Alis Tarihi****" + Blue);
        System.out.println("yil giriniz");
        alisTarih.setAlisYil(scan.next());
        if (alisTarih.alisYil.length() != 4) {
            System.out.println("Lutfen gecerli yil giriniz");
            alisYil();
        }
        if (!(Integer.parseInt(alisTarih.alisYil) >= LocalDate.now().getDayOfYear())) {
            System.out.println("Lutfen gecerli yil giriniz");
            alisYil();
        }
        alisAy();
    }

    public static void teslimYil() {
        System.out.println(Red + "****Teslim Tarihi****" + Blue);
        System.out.println("yil giriniz");
        alisTarih.setTeslimYil(scan.next());
        if (alisTarih.teslimYil.length() != 4) {
            System.out.println("Lutfen gecerli yil giriniz");
            teslimYil();
        }
        if (!(Integer.parseInt(alisTarih.teslimYil) >= 2023)) {
            System.out.println("Lutfen gecerli yil giriniz");
            teslimYil();
        }
        teslimAy();
    }

    public static void alisAy() {
        System.out.println("ay giriniz");
        alisTarih.setAlisAy(scan.next());
        if (alisTarih.alisAy.length() != 2 && alisTarih.alisAy.length() != 1) {
            System.out.println("Lutfen gecerli ay giriniz");
            alisAy();
        }
        if ((Integer.parseInt(alisTarih.alisAy) > 12) || (Integer.parseInt(alisTarih.alisAy) <= 0)) {
            System.out.println("Lutfen gecerli ay giriniz");
            alisAy();
        }
        alisGun();
    }

    public static void teslimAy() {
        System.out.println("ay giriniz");
        alisTarih.setTeslimAy(scan.next());
        if (alisTarih.teslimAy.length() != 2 && alisTarih.teslimAy.length() != 1) {
            System.out.println("Lutfen gecerli ay giriniz");
            teslimAy();
        }
        if ((Integer.parseInt(alisTarih.teslimAy) > 12) || (Integer.parseInt(alisTarih.teslimAy) <= 0)) {
            System.out.println("Lutfen gecerli ay giriniz");
            teslimAy();
        }
        teslimGun();
    }

    public static void alisGun() {
        System.out.println("gun giriniz");
        alisTarih.setAlisGun(scan.next());
        if (alisTarih.alisGun.length() != 2 && alisTarih.alisGun.length() != 1) {
            System.out.println("Lutfen gecerli gun giriniz");
            alisGun();
        }
        if ((Integer.parseInt(alisTarih.alisGun) > 31) && (Integer.parseInt(alisTarih.alisGun) <= 0)) {
            System.out.println("Lutfen gecerli gun giriniz");
            alisGun();
        }
        tarihKontrol();
    }

    public static void teslimGun() {
        System.out.println("gun giriniz");
        alisTarih.setTeslimGun(scan.next());
        if (alisTarih.teslimGun.length() != 2 && alisTarih.teslimGun.length() != 1) {
            System.out.println("Lutfen gecerli gun giriniz");
            teslimGun();
        }
        if ((Integer.parseInt(alisTarih.teslimGun) > 32) && (Integer.parseInt(alisTarih.teslimGun) <= 0)) {
            System.out.println("Lutfen gecerli gun giriniz");
            teslimGun();
        }
        teslimtarihKontrol();
    }

    public static void tarihKontrol() {
        alis = LocalDate.of(Integer.parseInt(alisTarih.getAlisYil()),
                Integer.parseInt(alisTarih.getAlisAy()),
                Integer.parseInt(alisTarih.getAlisGun()));
        if (alis.isBefore(ChronoLocalDate.from(LocalDateTime.now()))) {
            System.out.println("Lutfen gecerli tarih giriniz");
            alisTarih();
        }
        teslimTarih();
    }

    public static void teslimtarihKontrol() {
        teslim = LocalDate.of(Integer.parseInt(alisTarih.getTeslimYil()),
                Integer.parseInt(alisTarih.getTeslimAy()),
                Integer.parseInt(alisTarih.getTeslimGun()));
        if (teslim.isBefore(ChronoLocalDate.from(LocalDateTime.now()))) {
            System.out.println("Lutfen gecerli tarih giriniz");
            teslimTarih();
        }
        musteriolustur();
    }

    public static void alisTarih() {
        alisYil();
    }

    static void teslimTarih() {
        teslimYil();

    }

    public static void calistir() {
        araba();
        System.out.println(Yellow + " ****** HosGeldiniz ******\n" + Blue + " Lutfen Listeden araba seciniz\n" + Red + "  Marka   Model    Yakit   Vites       Fiyat\n1- " + carList.get(0) + "\n2- " + carList.get(1) +
                "\n3- " + carList.get(2) + "\n4- " + carList.get(3) + "\n5-Cikis ");
        int secim = scan.nextInt();

        switch (secim) {
            case 1:
                System.out.println("sectiginiz arac  - " + carList.get(0));
                carIndex = 0;
                alisTarih();
                break;

            case 2:
                System.out.println("sectiginiz arac  - " + carList.get(1));
                carIndex = 1;
                alisTarih();
                break;
            case 3:
                System.out.println("sectiginiz arac  - " + carList.get(2));
                carIndex = 2;
                alisTarih();
                break;
            case 4:
                System.out.println("sectiginiz arac  - " + carList.get(3));
                carIndex = 3;
                alisTarih();
                break;
            case 5:
                System.out.println("Iyi Gunler");
                break;
            default:
                System.out.println("Yanlis secim yaptiniz ");
                calistir();
                break;

        }

    }

}
