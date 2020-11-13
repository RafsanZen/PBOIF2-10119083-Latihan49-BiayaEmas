/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119083.latihan49.biayaemas;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @Nama     : Rafsan Zen Mustaofa
 * NIM       : 10119083
 * Kelas     : IF2
 * Deskripsi : Menampilkan program emas
 */
class Emas {
    private double hargaSatuGram;
    private double beratEmas;
    
    public Emas (double hargaSatuGram, double beratEmas){
        this.hargaSatuGram = hargaSatuGram;
        this.beratEmas = beratEmas;
    }
    
    private double totalHarga(){
        return hargaSatuGram * beratEmas;
    }
    
    public void tampil(){
        DecimalFormat kursID = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        
        formatRp.setCurrencySymbol(" Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursID.setDecimalFormatSymbols(formatRp);
        
        System.out.printf("===Program Pembelian bulan Oktober 2020===\n");
        System.out.printf("Mas yan dibeli Hendi : %.1f gram\n", beratEmas);
        System.out.printf("Harga 1 gram : Rp. %s\n", kursID.format(hargaSatuGram));
        System.out.printf("Total Harga  : Rp. %s\n", kursID.format(totalHarga()));
    }
}
