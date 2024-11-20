class Sepeda extends Kendaraan {
  private String jenisSepeda;

  public Sepeda(String merk, String model, int tahunProduksi, String jenisSepeda) {
      super(merk, model, tahunProduksi);
      this.jenisSepeda = jenisSepeda;
  }

  @Override
  public void tampilInfo() {
      System.out.println("Sepeda: " + merk + " " + model + " (" + tahunProduksi + "), Jenis: " + jenisSepeda);
  }

  public String getJenisSepeda() {
      return jenisSepeda;
  }
}
