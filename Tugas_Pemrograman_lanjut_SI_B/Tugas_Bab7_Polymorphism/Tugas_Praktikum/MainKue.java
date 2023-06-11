package Tugas_Pemrograman_lanjut_SI_B.Tugas_Bab7_Polymorphism.Tugas_Praktikum;

public class MainKue {
    public static void main(String[] args) {
        Kue kue[] = new Kue[20];
        kue[0] = new KuePesanan("Kue Lapis", 3750, 100);
        kue[1] = new KuePesanan("Bolu", 5000, 50);
        kue[2] = new KuePesanan("Onde-onde", 4650, 250);
        kue[3] = new KuePesanan("Kue Lumpur", 4500, 70);
        kue[4] = new KuePesanan("Dadar Gulung", 3500, 500);
        kue[5] = new KuePesanan("Pastel", 4000, 100);
        kue[6] = new KuePesanan("Putu Ayu", 3000, 600);
        kue[7] = new KuePesanan("Bolu Kukus", 3000, 50);
        kue[8] = new KuePesanan("Risoles", 4500, 340);
        kue[9] = new KuePesanan("Bolu Berry", 5900, 230);
        kue[10] = new KueJadi("Melonpan", 7500, 8);
        kue[11] = new KueJadi("Cheesecake", 8400, 7);
        kue[12] = new KueJadi("Tiramisu", 5000, 7);
        kue[13] = new KueJadi("Chococake", 9300, 5);
        kue[14] = new KueJadi("Nagasari", 4000, 8);
        kue[15] = new KueJadi("Matcha Cake", 8400, 3);
        kue[16] = new KueJadi("Vanilla Cake", 5300, 5);
        kue[17] = new KueJadi("Cucur Pandan", 4500, 9);
        kue[18] = new KueJadi("Klepon", 3000, 7);
        kue[19] = new KueJadi("Kue Sus", 5000, 8);
        for (Kue i : kue) {
            System.out.println(i.toString());
            System.out.println("");
        }
        double hasil = 0;
        double totalBeratJumlah = 0;
        for (Kue x : kue) {
            hasil += x.hitungHarga();
        }
        System.out.println("Total harga semua jenis kue = " + (int) hasil);
        System.out.println("");
        hasil = 0;
        for (int i = 0; i < 10; i++) {
            hasil += ((KuePesanan) kue[i]).hitungHarga();
            totalBeratJumlah += ((KuePesanan) kue[i]).getBerat();
        }
        System.out.println("Total harga kue jenis kue Pesanan = " + (int) hasil);
        System.out.println("Total berat kue jenis kue Pesanan = " + totalBeratJumlah);
        System.out.println("");
        hasil = 0;
        totalBeratJumlah = 0;
        for (int i = 0; i < 10; i++) {
            hasil += ((KueJadi) kue[i + 10]).hitungHarga();
            totalBeratJumlah += ((KueJadi) kue[i + 10]).getJumlah();
        }
        System.out.println("Total harga kue jenis kue Jadi = " + (int) hasil);
        System.out.println("Total jumlah kue jenis kue Jadi = " + (int) totalBeratJumlah);
        double hargaMax = 0;
        int indexKue = 0;
        System.out.println("\n");
        System.out.println("Kue dengan harga akhir terbesar");
        for (int i = 0; i < 10; i++) {
            if (((KuePesanan) kue[i]).hitungHarga() > hargaMax) {
                hargaMax = ((KuePesanan) kue[i]).hitungHarga();
                indexKue = i;
            }
            if (((KueJadi) kue[i + 10]).hitungHarga() > hargaMax) {
                hargaMax = ((KueJadi) kue[i + 10]).hitungHarga();
                indexKue = i + 10;
            }
        }
        System.out.println("Nama Kue\t: " + kue[indexKue].getNama());
        System.out.print("Jenis Kue\t: ");
        if (indexKue > 9) {
            System.out.println("Jadi");
        } else {
            System.out.println("Pesanan");
        }
        System.out.println("Harga akhir kue\t: " + hargaMax);

    }
}
