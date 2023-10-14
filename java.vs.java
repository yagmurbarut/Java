// öğrencinin yaşına göre hangi okula gittiğini gösteren örnek(üniversite ve mezunluk hariç): 

public class Degiskenler {

    public static void main(String[] args) {
 
   Scanner scanner = new Scanner(System.in);
        
        System.out.println("Lütfen yaşınızı giriniz: ");
        int yas= scanner.nextInt();
        
        if(yas<=5 && yas>1){
            System.out.println("kreşe gidiyor olmalısınız...");
        }
        else if(yas==6){
            System.out.println("anaokuluna gidiyor olmalısınız...");
        }
        else if(yas>6 && yas<=11){
            System.out.println("ilkokula gidiyor olmalısınız...");
        }
        else if(yas>11 && yas<=14){
            System.out.println("ortaokula gidiyor olmalısınız...");
        }
        else if(yas>14 && yas<=18){
            System.out.println("liseye gidiyor olmalısınız...");
        }
        else{
            System.out.println("Geçerli bir sayı giriniz!");
        }
    }
}