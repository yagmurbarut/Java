/* kullanıcıdan alınan iki sayının değerlerinin yer değiştirdiği program:  */
public class Degiskenler {

    public static void main(String[] args) {
      
 Scanner scanner = new Scanner(System.in);
 int say1;
 int say2;
        System.out.print("birinci sayı: ");
        say1= scanner.nextInt();
        
        System.out.print("ikinci sayı: ");
        say2= scanner.nextInt();
        
        System.out.println("sayılar yer değistirmeden önce: ");
        System.out.print("birinci sayı: "+say1);
        System.out.println(" ikinci sayı: "+say2);
        System.out.println("sayılar yer değistirdikten sonra: ");
        
 int gecici;
       gecici=say1;
       say1=say2;
       say2=gecici;
       System.out.print("birinci sayı: "+say1);
       System.out.print(" ikinci sayı: "+say2);
       
    }
}