package Tugas_Pemrograman_lanjut_SI_B.Tugas_Bab4_Modul_Enscapsulation.Tugas_Praktikum;

public class Swalayan {
    private double saldo;
    private double pembelian;
    private double cashback;
    private String nomorPelanggan;
    private String nama;
    private String jenisRekening;
    private String pin;
    private int valid;
    private boolean autentifikasi = false;

    public Swalayan(String nama, String jenisRekening) {
        this.nama = nama;
        this.jenisRekening = jenisRekening;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String s) {
        this.nama = s;
    }

    public void setPin(String s) {
        this.pin = s;
    }

    public void setSaldo(double j) {
        this.saldo = j;
    }

    public void setnomorPelanggan(String s) {
        this.nomorPelanggan = s;
    }

    public String getjenisRekening() {
        return jenisRekening;
    }

    public void setjenisRekening(String s) {
        this.jenisRekening = s;
    }

    public void informasiAkun() {
        System.out.println("Nama: " + nama);
        System.out.println("Nomor Pelanggan: " + nomorPelanggan);
        System.out.println("Jenis Rekening: " + jenisRekening);
    }

    public void setPembelian(double j) {
        if (valid == 3) {
            System.out.println("--------------------------------------------------------------------");
            System.out.println("Akun Anda telah terblokir");
        } else if (autentifikasi == false) {

        } else {
            this.pembelian = j;
            hitungPembelian(this.pembelian);
        }
    }

    public void autentifikasi(String nomorPelanggan1, String Pin1) {
        if (valid == 3) {
            System.out.println("Anda telah melebihi batas autentifikasi. Akun Anda akan diblokir");
            setnomorPelanggan(nomorPelanggan1);
            ;
            setPin(Pin1);
        } else {
            if (nomorPelanggan1.equals(nomorPelanggan)) {
                if (Pin1.equals(pin)) {
                    System.out.println("Autentifikasi Berhasil");
                    autentifikasi = true;
                } else {
                    System.out.println("Kesalahan Autentifikasi. Password yang Anda masukkan salah");
                }
            } else {
                System.out.println("Maaf, nama yang Anda masukkan tidak terdeteksi");
            }
            valid++;
        }
    }

    public void topUp(int j) {
        if (valid == 3) {
            System.out.println("--------------------------------------------------------------------");
            System.out.println("Akun Anda telah terblokir");
        } else if (autentifikasi == false) {

        } else {
            saldo = saldo + j;
            System.out.println("--------------------------------------------------------------------");
            System.out.println("Top up berhasil");
            System.out.println("Saldo Anda: " + saldo);
            System.out.println("--------------------------------------------------------------------");
        }
    }

    private double hitungCashback(double j) {
        pembelian = j;
        String jenis = nomorPelanggan.substring(0, 2);
        pembelian = j;

        switch (jenis) {
            case "38":
                cashback = pembelian * 0.05;
                saldo = saldo + cashback;
                System.out.println("Pembelian Berhasil");
                System.out.println("Cashback Anda: " + cashback);
                System.out.println("Saldo Anda: " + saldo);
                break;

            case "56":
                if (pembelian > 1000000) {
                    cashback = pembelian * 0.07;
                    saldo = saldo + cashback;
                    System.out.println("Pembelian Berhasil");
                    System.out.println("Cashback Anda: " + cashback);
                    System.out.println("Saldo Anda: " + saldo);
                } else {
                    cashback = pembelian * 0.02;
                    saldo = saldo + cashback;
                    System.out.println("Pembelian Berhasil");
                    System.out.println("Cashback Anda: " + cashback);
                    System.out.println("Saldo Anda: " + saldo);
                }
                break;

            case "74":
                if (pembelian > 1000000) {
                    cashback = pembelian * 0.10;
                    saldo = saldo + cashback;
                    System.out.println("Pembelian Berhasil");
                    System.out.println("Cashback Anda: " + cashback);
                    System.out.println("Saldo Anda: " + saldo);
                } else {
                    cashback = pembelian * 0.05;
                    saldo = saldo + cashback;
                    System.out.println("Pembelian Berhasil");
                    System.out.println("Cashback Anda: " + cashback);
                    System.out.println("Saldo Anda: " + saldo);
                }
                break;
        }
        return cashback;
    }

    private void hitungPembelian(double pembelian) {
        double sisa = saldo - pembelian;
        if (sisa < 10000) {
            System.out.println("Pembelian Gagal");
            System.out.println("Saldo Anda: " + sisa);
        } else {
            saldo = sisa;
            hitungCashback(this.pembelian);
        }
    }
}
