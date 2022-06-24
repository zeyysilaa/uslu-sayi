import java.util.Scanner;
public class UsluSayi {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int n,k, sonuc=1;
        System.out.println("n sayisini giriniz : ");
        n = girdi.nextInt();
        System.out.println("k sayisini giriniz : ");
        k = girdi.nextInt();
        for (int i = 1; i <= k; i++){
            sonuc *= n;
        }
        System.out.println(sonuc);

    }
}
