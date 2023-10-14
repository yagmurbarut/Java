/* 
    == ----> eşit mi?
    != ----> eşit değil mi?
    >  ----> büyük mü?
    >= ----> büyük veya eşit mi?
    <  ----> küçük mü?
    <= ----> küçük veya eşit mi?
*/
public class Degiskenler {

    public static void main(String[] args) {
 
        System.out.println(7==7); // true çıktısını alırız çünkü eşitler
        System.out.println(2!=2); // false çıktısını alırız çünkü eşit değil mi diye bakıyoruz ama eşitler
        System.out.println(3>7);  // false çıktısı
        System.out.println(4>=4); // true çıktısı alırız eşit veya büyük şartından "eşit"i sağlıyor
        System.out.println(2<3);  // true çıktısı
        System.out.println(3<=3); // true çıktısı alırız eşitlik şartını sağlar
        System.out.println("yagmur" == "yagmur");
        System.out.println("yagmur" != "yamur");
       
    }
}
