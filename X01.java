// 12S24055 - Theresia Oktaviani Samosir
// 12S24016 - Boy Harendy Simamora 

import java.util.*;
import java.lang.Math;

public class X01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double hargabuku, hasil, nilai, terkecil, hasilakhir;
        int jumlahbuku;

        nilai = 0;
        jumlahbuku = 0;
        terkecil = 99999;
        hasil = 0;
        hasilakhir = 0;
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
            System.out.println(hasil);
        }
        System.out.println(hasilakhir);
    }
}
