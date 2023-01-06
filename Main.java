import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       int sayi;
       int basamakSayisi=0;
       int basamakDegeri;
       int toplam = 0 ;
       Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen Değer Giriniz: ");
        sayi = inp.nextInt();

        int geciciSayi = sayi;
        while (geciciSayi != 0){
            basamakDegeri = geciciSayi % 10;
            toplam += basamakDegeri;
            geciciSayi /=10;

        }
        System.out.println("Toplam: " + toplam);












       /*
        * Kullanıcıdan bir değer al
        * Kullanıcıdan aldığın değerin basamak sayısını bul
        * Kullanıcıdan aldığın değeri sayılar tekil olana kadar bul
        * Bulduğun tekil sayıları basamak sayılarının üssü olana kadar işlem yap
        * Eğer işlem kullanıcının girdiği sayıya eşitse çıktı olarak bu sayı armstrong sayıdır diye çıktı ver


        int sayi;
        int basamakSayisi=0;
        int basamakDegeri;
        int usCarpim;
        int toplam = 0 ;
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen Değer Giriniz: ");
        sayi = inp.nextInt();
        int geciciSayi = sayi;

        while (geciciSayi != 0){
            geciciSayi /=10;
            basamakSayisi++;
        }
        geciciSayi = sayi;
        while (geciciSayi != 0){
            basamakDegeri = geciciSayi % 10;
            geciciSayi /= 10;
            usCarpim = 1;
            for (int i = 1; i<=basamakSayisi; i++){
                usCarpim *= basamakDegeri;
            }toplam += usCarpim;
        }
        if (toplam == sayi){
            System.out.println(sayi + " bir armstrong sayıdır.");
        }else {
            System.out.println(sayi + " bir armstrong sayı değildir");
        }
        */

    }
}