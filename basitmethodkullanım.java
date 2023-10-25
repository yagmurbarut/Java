// Method kullanımı

public class Degiskenler {

    public static void isim(String isim){
        System.out.println("selam "+isim);
    }   
    
    public static void toplama(int a,int b) {
        System.out.println("toplam: "+(a+b));
    }
    public static void main(String[] args) {
    
        isim("yağmur");
        toplama(4, 8);
    }
 }
