/*
* Ad Soyad: Süleyman Kılınç
* Ogrenci No: 250541031
* Tarih: 30 Ekim 2025
* Aciklama: Görev 2: Geometrik Hesaplayıcı
*/

import java.util.Scanner;

public class GeometrikHesap {

    public static void main(String[] args) {

        // --- SABİTLER ---
        final double PI = 3.14159;
        final String PROGRAM_BASLIGI = "=== GEOMETRIK HESAPLAYICI ===";

        // --- GİRİŞ ---
        Scanner input = new Scanner(System.in);
        System.out.println(PROGRAM_BASLIGI);

        System.out.print("Dairenin yaricapini girin (cm): ");
        double yariCap = input.nextDouble();

        // --- HESAPLAMALAR ---
        
        // 1. Daire Alanı: π * r^2
        double daireAlani = PI * Math.pow(yariCap, 2); // r^2 için Math.pow(r, 2)

        // 2. Daire Çevresi: 2 * π * r
        double daireCevresi = 2 * PI * yariCap;

        // 3. Daire Çapı: 2 * r
        double daireCapi = 2 * yariCap;

        // 4. Küre Hacmi: (4/3) * π * r^3
        double kureHacmi = (4.0 / 3.0) * PI * Math.pow(yariCap, 3); // r^3 için Math.pow(r, 3)

        // 5. Küre Yüzey Alanı: 4 * π * r^2
        double kureYuzeyAlani = 4 * PI * Math.pow(yariCap, 2);

        
        // --- ÇIKIŞ ---
        System.out.println("\nSONUCLAR:");
        System.out.println("----------");

        System.out.printf("%-18s : %8.2f cm^2\n", "Daire Alani", daireAlani);
        System.out.printf("%-18s : %8.2f cm\n", "Daire Cevresi", daireCevresi);
        System.out.printf("%-18s : %8.2f cm\n", "Daire Capi", daireCapi);
        System.out.printf("%-18s : %8.2f cm^3\n", "Kure Hacmi", kureHacmi);
        System.out.printf("%-18s : %8.2f cm^2\n", "Kure Yuzey Alani", kureYuzeyAlani);

        input.close();
    }
}

