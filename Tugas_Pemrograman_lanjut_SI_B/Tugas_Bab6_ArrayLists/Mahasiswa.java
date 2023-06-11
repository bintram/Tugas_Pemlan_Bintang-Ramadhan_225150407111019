package Tugas_Pemrograman_lanjut_SI_B.Tugas_Bab6_ArrayLists;

public class Mahasiswa {
  private String nama;
  private String jurusan;
  private boolean status; // true=Menikah ; false=Lajang

  // Tambahkan constructor disini ...
  public Mahasiswa(String nama, String jurusan, boolean status) {
    this.nama = nama;
    this.jurusan = jurusan;
    this.status = status;
  }

  // Tambahkan method setter & getter disini ...
  // Setter
  public void setNama(String nama) {
    this.nama = nama;
  }

  public void setJurusan(String jurusan) {
    this.jurusan = jurusan;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }

  // Getter
  public String getNama() {
    return this.nama;
  }

  public String getJurusan() {
    return this.jurusan;
  }

  public boolean getStatus() {
    return this.status;
  }
}
