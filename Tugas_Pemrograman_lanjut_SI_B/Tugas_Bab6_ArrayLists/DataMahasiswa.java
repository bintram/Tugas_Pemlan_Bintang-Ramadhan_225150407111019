package Tugas_Pemrograman_lanjut_SI_B.Tugas_Bab6_ArrayLists;

import java.util.ArrayList;

public class DataMahasiswa {
  private static ArrayList<Mahasiswa> mhs = new ArrayList<>();

  public static ArrayList<Mahasiswa> tambahMahasiswa(String nama, String jurusan, boolean status) {
    Mahasiswa mahasiswaBaru = new Mahasiswa(nama, jurusan, status);
    mhs.add(mahasiswaBaru);
    return mhs;
  }

  public static void tampilSemuaData() {
    // Gunakan perulangan
    int index = 1;

    for (Mahasiswa m : mhs) {
      System.out.println("=== Tampilan Data Mahasiswa " + (index) + " Filkom UB ===");
      System.out.println("Nama    : " + m.getNama());
      System.out.println("Jurusan : " + m.getJurusan());
      System.out.println("Status  : " + (m.getStatus() ? "Menikah" : "Belum Menikah"));
      System.out.println();
      index++;
    }
  }

  public static Mahasiswa cariMahasiswa(String nama) {
    // Gunakan perulangan
    for (Mahasiswa m : mhs) {
      if (m.getNama().equals(nama)) {
        return m;
      }
    }
    return null;
  }

  public static void tampilMahasiswa(Mahasiswa mahasiswa) {
    System.out.println("Nama    : " + mahasiswa.getNama());
    System.out.println("Jurusan : " + mahasiswa.getJurusan());
    System.out.println("Status  : " + (mahasiswa.getStatus() ? "Menikah" : "Lajang"));
    System.out.println();
  }

  public static void updateMahasiswa(String nama, String jurusan, boolean status) {
    Mahasiswa m = cariMahasiswa(nama);
    if (m != null) {
      m.setNama(nama);
      m.setJurusan(jurusan);
      m.setStatus(status);
    }
  }
}
