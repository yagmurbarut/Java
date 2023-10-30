// Method overloading(Methodlarda aşırı yükleme)

public class Degiskenler {

    public static void puanhesapla(String isim, int sayi){
        System.out.println(isim+ " adlı öğrencinin " +sayi+ "puanı var");
    }
    public static void puanhesapla(int sayi) {
        System.out.println("isimsiz öğrencinin " +sayi+ "puanı var");
    }
    public static void puanhesapla(String isim){
        System.out.println(isim+ " adlı öğrenci sınava girmemiş");
    }
    public static void main(String[] args) {
        puanhesapla("yagmur");
        puanhesapla(57);
        puanhesapla("aleren", 100);
        
        
    }
 }
