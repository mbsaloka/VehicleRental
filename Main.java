import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Membuat kendaraan
        Kendaraan mobil1 = new Mobil("Toyota", "Avanza", 2022, 4);
        Kendaraan motor1 = new Motor("Yamaha", "NMAX", 2021, 2);
        Kendaraan sepeda1 = new Sepeda("Polygon", "Mountain", 2023, "BMX");

        // Membuat penyewa
        Penyewa penyewa1 = new Penyewa("Budi", mobil1);
        Penyewa penyewa2 = new Penyewa("Siti", motor1);
        Penyewa penyewa3 = new Penyewa("Andi", sepeda1);

        // Daftar kendaraan yang tersedia
        ArrayList<Kendaraan> daftarKendaraan = new ArrayList<>();
        daftarKendaraan.add(mobil1);
        daftarKendaraan.add(motor1);
        daftarKendaraan.add(sepeda1);

        // Menampilkan daftar kendaraan yang tersedia
        System.out.println("Daftar Kendaraan Tersedia:");
        for (Kendaraan k : daftarKendaraan) {
            k.tampilInfo();
        }

        // Menampilkan daftar penyewa dan kendaraan yang disewa
        System.out.println("\nDaftar Penyewa:");
        penyewa1.tampilInfoPenyewa();
        penyewa2.tampilInfoPenyewa();
        penyewa3.tampilInfoPenyewa();
    }
}
