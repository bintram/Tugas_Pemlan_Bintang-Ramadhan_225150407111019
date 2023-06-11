package Tugas_Pemrograman_lanjut_SI_B.Tugas_Bab6_ArrayLists;

public class Main {
  public static void main(String[] args) {

    // Lakukan modifikasi data tambah mahasiswa ...
    DataMahasiswa.tambahMahasiswa("Denar Abidin", "Pendidikan Teknologi Informasi", false);
    DataMahasiswa.tambahMahasiswa("Grenda Jamaludin", "Sistem Informasi", true);
    DataMahasiswa.tambahMahasiswa("Fathia Annisa", "Teknik Informatika", false);

    // Method tampilSemuaData
    DataMahasiswa.tampilSemuaData();

    // Method cariMahasiswa (jika data ada)
    System.out.println("============== Cari Mahasiswa ==============");
    Mahasiswa m1 = DataMahasiswa.cariMahasiswa("Denar Abidin");
    if (m1 != null) {
      System.out.println("Data mahasiswa atas nama Denar Abidin ditemukan.");
    } else {
      System.out.println("Data mahasiswa atas nama Denar Abidin tidak ditemukan.");
    }

    // Method cariMahasiswa (jika data tidak ada)
    System.out.println("\n");
    System.out.println("============== Cari Mahasiswa ==============");
    Mahasiswa m2 = DataMahasiswa.cariMahasiswa("Sinta Marissa");
    if (m2 != null) {
      System.out.println("Data mahasiswa atas nama Sinta Marissa ditemukan.");
    } else {
      System.out.println("Data mahasiswa atas nama Sinta Marissa tidak ditemukan.");
    }

    // Method tampilMahasiswa (sebelum diupdate)
    System.out.println("\n");
    System.out.println("============= Sebelum diupdate =============");
    DataMahasiswa.tampilMahasiswa(m1);

    // Method tampilMahasiswa (setelah diupdate)
    DataMahasiswa.updateMahasiswa("Denar Abidin", "Teknik Informatika", true);
    System.out.println("============= Setelah diupdate =============");
    DataMahasiswa.tampilMahasiswa(m1);
  }
}
