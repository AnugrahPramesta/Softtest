/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softtesting;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Jhon {

    public static void main(String[] args) {
        int  jam_kerja, jam_lembur, ttl_jam;
        double uph, uph_lembur,gj_total,gj_lembur, tabungan, pengeluaran;
        uph = 15000;
        jam_kerja = 40;
        String ulg = "y";
        while (ulg.equals("y")) {
            Scanner scan = new Scanner(System.in);
            System.out.println("********** SELAMAT DATANG ***********");
            System.out.println("             MENU UTAMA             ");
            System.out.println("1. Hitung Gaji");
            System.out.println("2. Status Menabung");
            System.out.println("3. exit");
            System.out.println("=====================================");
            System.out.print("Pilihan [1/2/3] = ");
            int menu = scan.nextInt();
            System.out.println("=====================================");

            switch (menu) {
                case 1:
                    System.out.print("Masukkan Jam kerja anda / minggu : ");
                    ttl_jam = scan.nextInt();
                    if (ttl_jam > jam_kerja) {
                        uph_lembur = 15000 * 1.5;
                        jam_lembur = ttl_jam - jam_kerja;
                        gj_total = (uph * jam_kerja) + (jam_lembur * uph_lembur);
                        System.out.println("Jam lembur anda minggu ini : " + jam_lembur + " jam");
                        System.out.println("Total Gaji anda minggu ini : Rp " + gj_total);
                    } else {
                        gj_total = uph * ttl_jam;
                        System.out.println("Total Gaji anda minggu ini : Rp " + gj_total);
                    }
                    break;

                case 2:
                    System.out.print("Masuukan Gaji Anda / Minggu : Rp ");
                    gj_total = scan.nextInt();
                    System.out.print("Masukkan Pengeluaran Anda / Minggu : Rp ");
                    pengeluaran = scan.nextInt();
                    if (gj_total > pengeluaran) {
                        tabungan = gj_total - pengeluaran;
                        System.out.println("Bisa Menabung");
                        System.out.println("Tabungan Anda Minggu ini = Rp " + tabungan);
                    } else if (gj_total < pengeluaran) {
                        System.out.println("Cari Tambahan Uang");
                    } else {
                        System.out.println("Anda Tidak Bisa Menabung");
                    }
                    break;

                case 3:
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Maaf, Menu Tidak Tersedia");
            }
            System.out.println("=====================================");
            System.out.print("Kembali Ke Menu? (y/t) : ");
            ulg = scan.next();
        }
    }
}
