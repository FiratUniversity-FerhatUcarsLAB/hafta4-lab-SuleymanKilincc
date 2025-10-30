/*
* Ad Soyad: Süleyman Kılınç
* Ogrenci No: 250541031
* Tarih: 30 Ekim 2025
* Aciklama: Görev 3: Maaş Hesaplama Sistemi
*/

import java.util.Scanner;

public class MaasHesap {

    public static void main(String[] args) {

        // --- SABİTLER  ---
        final double SGK_ORANI = 0.14;
        final double GELIR_VERGISI_ORANI = 0.15;
        final double DAMGA_VERGISI_ORANI = 0.00759;

        // Hesaplama için yardımcı sabitler
        final int AYLIK_NORMAL_CALISMA_SAATI = 160; // (Brüt Maaş / 160)
        final double MESAI_CARPANI = 1.5;
        
        // Çıktı formatı için sabitler
        final String CIZGI = "------------------------";
        final String ANA_CIZGI = "====================================";
        final String BASLIK = "MAAS BORDROSU";

        // --- GİRİŞ ---
        Scanner input = new Scanner(System.in);

        System.out.print("Calisan adi soyadi girin: ");
        String adSoyad = input.nextLine();

        System.out.print("Aylik brut maas (TL): ");
        double brutMaas = input.nextDouble();

        System.out.print("Haftalik calisma saati: ");
        int haftalikCalismaSaati = input.nextInt(); 

        System.out.print("Mesai saati sayisi: ");
        int mesaiSaati = input.nextInt();

        
        // --- 1. GELİRLER HESAPLAMASI ---
        double saatlikUcret = brutMaas / AYLIK_NORMAL_CALISMA_SAATI;
        double mesaiUcreti = saatlikUcret * mesaiSaati * MESAI_CARPANI;
        double toplamGelir = brutMaas + mesaiUcreti;

        // --- 2. KESİNTİLER HESAPLAMASI ---
        double sgkKesintisi = toplamGelir * SGK_ORANI;
        double gelirVergisiKesintisi = toplamGelir * GELIR_VERGISI_ORANI;
        double damgaVergisiKesintisi = toplamGelir * DAMGA_VERGISI_ORANI;
        double toplamKesinti = sgkKesintisi + gelirVergisiKesintisi + damgaVergisiKesintisi;

        // --- 3. NET MAAŞ HESAPLAMASI ---
        double netMaas = toplamGelir - toplamKesinti;


        // --- ÇIKIŞ  ---
        System.out.println("\n" + ANA_CIZGI);
        System.out.println(BASLIK);
        System.out.println(ANA_CIZGI);
        
        System.out.printf("Calisan: %s\n", adSoyad);
        
        System.out.println("\nGELIRLER:");
        
        System.out.printf("%-25s : %10.2f TL\n", "Brut Maas", brutMaas);
        
        String mesaiLabel = String.format("Mesai Ucreti (%d saat)", mesaiSaati);
        System.out.printf("%-25s : %10.2f TL\n", mesaiLabel, mesaiUcreti);
        
        System.out.println(CIZGI);
        System.out.printf("%-25s : %10.2f TL\n", "TOPLAM GELIR", toplamGelir);
        
        System.out.println("\nKESINTILER:");
        
        String sgkLabel = String.format("SGK Kesintisi (%.1f%%)", SGK_ORANI * 100); 
        System.out.printf("%-25s : %10.2f TL\n", sgkLabel, sgkKesintisi);
        
        String gvLabel = String.format("Gelir Vergisi (%.1f%%)", GELIR_VERGISI_ORANI * 100);
        System.out.printf("%-25s : %10.2f TL\n", gvLabel, gelirVergisiKesintisi);

        String dvLabel = String.format("Damga Vergisi (%.1f%%)", DAMGA_VERGISI_ORANI * 100);
        System.out.printf("%-25s : %10.2f TL\n", dvLabel, damgaVergisiKesintisi);
        
        System.out.println(CIZGI);
        System.out.printf("%-25s : %10.2f TL\n", "TOPLAM KESINTI", toplamKesinti);

        System.out.printf("\n%-25s : %10.2f TL\n", "NET MAAS", netMaas);
        System.out.println(ANA_CIZGI);
        
        input.close();
    }
}

