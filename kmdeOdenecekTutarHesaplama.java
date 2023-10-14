/* sürücünün ne kadarlık benzin alması gerektiğini hesaplayan program */
public class Degiskenler {

    public static void main(String[] args) {
      
  Scanner scanner =  new Scanner (System.in);
        System.out.println("aracınızın kilometrede ne kadar yaktığını giriniz: (örn: 0,45 krş)");
        double yakıt= scanner.nextDouble();
        System.out.println("aracınızla gideceğiniz mesafe nedir? (örn:3,7km)");
        double yol= scanner.nextDouble();
        double gerekliYakıt= yakıt*yol;
        System.out.println("benzine ödeyeceğiniz tutar: " +gerekliYakıt +"tldir.");
        
       
    }
}
