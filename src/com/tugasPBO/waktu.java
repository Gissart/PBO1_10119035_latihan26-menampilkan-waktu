package com.tugasPBO;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author User
 * NAMA         : Argya Aulia Fauzandika
 * KELAS        : IF1
 * NIM          : 10119035
 * Deskripsi Program : menampilkan tanggal berdasarkan lokasi dan waktu sekarang
 */

public class waktu {
    static Date date = new Date();
    static Locale lokal = Locale.forLanguageTag("id");
    static SimpleDateFormat formatter = new SimpleDateFormat("EEEE, dd MMM yyyy HH:mm:ss", lokal);

    private static void tampilWaktu(){
        System.out.println("Hari ini adalah hari : " + formatter.format(date));
    }

    public static void main(String[] args) {
        tampilWaktu();
        System.out.println("Developed by : Argya Aulia Fauzandika");
    }
}