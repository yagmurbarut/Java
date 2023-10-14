/* dik kenarları a ve b, hipotenüsü h olan üçgenin hipotenüsünü hesaplayan program:  */
public class Degiskenler {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
  int a;
  int b;
        System.out.println("dik kenarlardan ilkini giriniz: ");
        a= scanner.nextInt();
        System.out.println("dik kenarlardan ikincisini giriniz: ");
        b= scanner.nextInt();
        
  double h= Math.sqrt(a*a + b*b);
        System.out.println("hipotenüs uzunluğu: "+h);
  
  
    }
}