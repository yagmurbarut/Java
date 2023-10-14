// If ve else blokları kullanılarak alınan puana göre eğitime katılınıp katılınamayacağını gösteren program:

public class Degiskenler {

    public static void main(String[] args) {
 
   Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen puanınızı giriniz: ");
        int puan= scanner.nextInt();
        
        if(puan<=70){
            System.out.println("maalesef bootcampe katılamazsınız!");
        }
        else{
            System.out.println("tebrikler bootcampe katılmaya hak kazandınız!");
        }
    }
}