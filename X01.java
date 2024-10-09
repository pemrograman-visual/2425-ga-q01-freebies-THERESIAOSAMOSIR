// 12S24055 - Theresia Oktaviani Samosir
// 12S24016 - Boy Harendy Simamora 

import java.util.*;
import java.lang.Math;

public class X01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double hargabuku, hasil, nilai, jumlahbuku, terkecil, hasilakhir;

        nilai = 0;
        jumlahbuku = 0;
        terkecil = 99999;
        do {
            hargabuku = Double.parseDouble(input.nextLine());
            if (hargabuku == 0) {
            } else {
                hasil = hargabuku + nilai;
                nilai = hasil;
                jumlahbuku = jumlahbuku + 1;
                if (terkecil < hargabuku) {
                } else {
                    terkecil = hargabuku;
                }
            }
        } while (hargabuku != 0);
        if (jumlahbuku >= 2 && hasil >= 100) {
            hasilakhir = hasil - terkecil;
        } else {
            System.out.println(toFixed(hasil,2));
        }
        System.out.println(toFixed(hasilakhir,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
