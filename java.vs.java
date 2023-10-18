// kullanıcıdan alınan sayının rakamları toplamını bulan program: 
public class Degiskenler {

   
    public static void main(String[] args) {
    
        Scanner scanner= new Scanner(System.in);
        
        System.out.println("lütfen bir sayı giriniz: ");
        int sayi= scanner.nextInt();
        
        int toplam=0;
        
        do {            
            toplam+= sayi % 10;
            sayi= sayi /10;
        } while (sayi>0);
    
        System.out.println("sayının rakamları toplamı: "+ toplam);
    }
 }