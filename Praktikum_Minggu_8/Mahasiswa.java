import java.lang.Comparable;

class Mahasiswa implements Comparable<Mahasiswa> {
  private float ipk;
  private int kodeJurusan;
  private int angkatan;

  public Mahasiswa(int kodeJurusan, int angkatan, float ipk) {
    this.ipk = ipk;
    this.kodeJurusan = kodeJurusan;
    this.angkatan = angkatan;
  }

  public int getKodeJurusan() {
    return this.kodeJurusan;
  }

  public int getAngkatan() {
    return this.angkatan;
  }

  public float getIpk() {
    return this.ipk;
  }

  public int compareTo(Mahasiswa m) {
    // compareTo mengembalikan:
    // 0 bila this sama dengan m
    // 1 bila this lebih dari m
    // -1 bila this kurang dari m
    int kode_1, kode_2, angkatan_1, angkatan_2;
    float ipk_1, ipk_2;
    kode_1 = this.getKodeJurusan();
    kode_2 = m.getKodeJurusan();
    angkatan_1 = this.getAngkatan();
    angkatan_2 = m.getAngkatan();
    ipk_1 = this.getIpk();
    ipk_2 = m.getIpk();
    if (kode_1 < kode_2) {
      return -1;
    } else if (kode_1 == kode_2) {
      if (angkatan_1 > angkatan_2) return -1;
      else if (angkatan_1 == angkatan_2) {
        if (ipk_1 > ipk_2) return -1;
        else if (ipk_1 == ipk_2) return 0;
      }
    }
    return 1;
  }
}