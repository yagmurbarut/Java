public class Degiskenler {

    public static void main(String[] args) {
      
  Scanner scanner =  new Scanner (System.in);
        System.out.println("kilonuzu girin: ");
        int kilo= scanner.nextInt();
        System.out.println("boyunuzu giriniz: (örn: 1,70 gibi)");
        double boy= scanner.nextDouble();
        double bki= kilo / (boy*boy);
        System.out.println("beden kitle indeksiniz: "+bki);
        
    }
}
