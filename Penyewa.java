class Penyewa {
  private String nama;
  private Kendaraan kendaraanSewa;

  public Penyewa(String nama, Kendaraan kendaraanSewa) {
      this.nama = nama;
      this.kendaraanSewa = kendaraanSewa;
  }

  public void tampilInfoPenyewa() {
      System.out.println("Penyewa: " + nama);
      kendaraanSewa.tampilInfo(); // Menampilkan informasi kendaraan yang disewa
  }
}
