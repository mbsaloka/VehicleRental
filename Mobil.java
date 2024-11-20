public class Mobil extends Kendaraan {
  private int jumlahRoda;

  public Mobil(String merk, String model, int tahunProduksi, int jumlahRoda) {
      super(merk, model, tahunProduksi);
      this.jumlahRoda = jumlahRoda;
  }

  @Override
  public void tampilInfo() {
      System.out.println("Mobil: " + merk + " " + model + " (" + tahunProduksi + "), Jumlah Roda: " + jumlahRoda);
  }

  public int getJumlahRoda() {
      return jumlahRoda;
  }
}
