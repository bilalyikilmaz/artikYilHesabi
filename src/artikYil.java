import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class artikYil {
    public static void main(String[] args) {

        //Değişkenler
        int year;
        String sonuc;
        Scanner input;

        //Kullanıcı Veri Girişi
        input = new Scanner(System.in);
        System.out.print("Yıl Giriniz : ");
        year = input.nextInt();

        //Hesaplama Bloğu
        if ((year % 100) == 0) {
            if ((year % 400) == 0) {
                sonuc = "Artık Yıldır";
            } else {
                sonuc = "Artık Yıl Değildir";
            }
        } else if (year % 4 == 0) {
            sonuc = "Artık Yıldır";
        } else {
            sonuc = "Artık Yıl Değildir.";
        }
        System.out.println(+year + " " + sonuc);

    }
}
