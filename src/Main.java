import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fibonacci serisinin eleman sayısını girin: ");
        int elemanSayisi = scanner.nextInt();

        int oncekiSayi = 0;
        int sonrakiSayi = 1;

        System.out.println("Fibonacci serisi:");
        for (int i = 1; i <= elemanSayisi; i++) {


            int toplam = oncekiSayi + sonrakiSayi;
            System.out.println(oncekiSayi +"+"+ sonrakiSayi+"="+ toplam +" ");
            oncekiSayi = sonrakiSayi;
            sonrakiSayi = toplam;

        }

    }
}