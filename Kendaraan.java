abstract class Kendaraan {
  protected String merk;
  protected String model;
  protected int tahunProduksi;

  public Kendaraan(String merk, String model, int tahunProduksi) {
      this.merk = merk;
      this.model = model;
      this.tahunProduksi = tahunProduksi;
  }

  public abstract void tampilInfo(); // Metode abstrak untuk menampilkan informasi kendaraan

  public String getMerk() {
      return merk;
  }

  public String getModel() {
      return model;
  }

  public int getTahunProduksi() {
      return tahunProduksi;
  }
}
