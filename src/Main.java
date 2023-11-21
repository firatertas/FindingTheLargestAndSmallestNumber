import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük
sayıları bulan ve bu sayıları ekrana yazan programı yazın.

# Senaryo
Kaç tane sayı gireceksiniz: 4
1. Sayıyı giriniz: 16
2. Sayıyı giriniz: -22
3. Sayıyı giriniz: -15
4. Sayıyı giriniz: 100

## Çıktı:
   * En büyük sayı: 100
   * En küçük sayı: -22
         */
        int N, number, max=1, min, value = 1;
        min=max;
        Scanner sc = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.print(i + ". Sayıyı girirniz : ");
            number = sc.nextInt();
            if (max < number) {
                max = number;
            }
            if (min > number){
                min=number;
            }
        }
        System.out.println("--------------------------------------");
        System.out.print("* En büyük sayı :"+max+"\n*En küçük sayı : "+min);
    }
}