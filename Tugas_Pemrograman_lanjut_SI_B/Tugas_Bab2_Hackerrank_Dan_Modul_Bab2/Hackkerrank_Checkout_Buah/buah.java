package Tugas_Pemrograman_lanjut_SI_B.Tugas_Bab2_Hackerrank_Dan_Modul_Bab2.Hackkerrank_Checkout_Buah;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Buah {
    String nama;
    int stok;

    Buah(String nama, int stok) {
        this.nama = nama;
        this.stok = stok;
    }
}

class Manusia {
    String nama;
    int jumlahBeli;

    Manusia(String nama) {
        this.nama = nama;
        this.jumlahBeli = 0;
    }

    public void beliBuah(Buah buah, int jumlah) {
        if (buah.stok >= jumlah) {
            buah.stok -= jumlah;
            this.jumlahBeli += jumlah;
            System.out.println("Berhasil checkout buah");
            System.out.println("Sisa buah" + " = " + buah.stok);
        } else {
            System.out.println("Gagal checkout buah");
        }
    }
}

public class buah {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String namaBuah = scan.nextLine();
        int stokBuah = scan.nextInt();
        int jumlahBeli = scan.nextInt();

        if (stokBuah == 0 || jumlahBeli == 0) {
            System.out.println("NA");
        } else {
            Buah buah = new Buah(namaBuah, stokBuah);
            Manusia manusia = new Manusia("Pak Tejo");
            manusia.beliBuah(buah, jumlahBeli);
        }

    }
}
