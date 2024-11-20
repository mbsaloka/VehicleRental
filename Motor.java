class Motor extends Kendaraan {
  private int jumlahRoda;

  public Motor(String merk, String model, int tahunProduksi, int jumlahRoda) {
      super(merk, model, tahunProduksi);
      this.jumlahRoda = jumlahRoda;
  }

  @Override
  public void tampilInfo() {
      System.out.println("Motor: " + merk + " " + model + " (" + tahunProduksi + "), Jumlah Roda: " + jumlahRoda);
  }

  public int getJumlahRoda() {
      return jumlahRoda;
  }
}
