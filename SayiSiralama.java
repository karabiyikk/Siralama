package KosulluIfadeler;

import java.util.Scanner;

//Girilen 3 sayıyı "küçükten büyüğe" sıralayan program.
public class SayiSiralama {
    public static void main(String[] args) {
        int a, b, c;
        Scanner number = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin : ");
        a = number.nextInt();
        System.out.print("İkinci sayıyı girin : ");
        b = number.nextInt();
        System.out.print("Üçüncü sayıyı girin : ");
        c = number.nextInt();

        if ((a < b) && (a < c)) {
            if (b < c) {
                System.out.print("Sıralama : a < b < c");
            } else {
                System.out.print("Sıralama : a < c < b");
            }
        } else if ((b < a) && (b < c)) {
            if (a < c) {
                System.out.print("Sıralama : b < a < c");
            } else {
                System.out.print("Sıralama b < c < a");
            }
        } else {
            if (b < a) {
                System.out.print("Sıralama : c < b < a");
            } else {
                System.out.print("Sıralama : c < a < b");
            }
        }
    }
}
