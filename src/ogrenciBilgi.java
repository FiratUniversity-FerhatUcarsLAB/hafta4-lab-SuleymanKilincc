/*
 * Ad Soyad: Süleyman Kılınç
 * Ogrenci No: 250541031
 * Tarih: 29 Ekim 2025
 * Aciklama: Görev 1: Öğrenci Bilgi Sistemi
 */

import java.util.Scanner;

public class ogrenciBilgi {

    public static void main(String[] args) {

        final String PROGRAM_BASLIGI = "=== OGRENCI BILGI SISTEMI ===";
        final double BASARILI_GPA_ESIGI = 3.00;

        Scanner input = new Scanner(System.in);

        System.out.println(PROGRAM_BASLIGI);

        System.out.print("Adinizi girin: ");
        String ad = input.next();

        System.out.print("Soyadinizi girin: ");
        String soyad = input.next();

        System.out.print("Ogrenci numaraniz: ");
        int ogrenciNumarasi = input.nextInt();

        System.out.print("Yasiniz: ");
        int yas = input.nextInt();

        System.out.print("GPA (0.00-4.00): ");
        double gpa = input.nextDouble();

        System.out.println(PROGRAM_BASLIGI);

        System.out.printf("Ad Soyad: %s %s\n", ad, soyad);
        System.out.printf("Ogrenci No: %d\n", ogrenciNumarasi);
        System.out.printf("Yas: %d\n", yas);

        System.out.printf("GPA: %.2f\n", gpa);

        if (gpa >= BASARILI_GPA_ESIGI) {
            System.out.println("Durum: Basarili Ogrenci");
        } else if (gpa >= 2.0) {
            System.out.println("Durum: Gecer");
        } else {
            System.out.println("Durum: Basarisiz");
        }

        input.close();
    }
}
