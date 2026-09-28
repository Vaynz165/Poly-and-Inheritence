public class Main {
    public static void main(String[] args) {
        System.out.println("=== Output Exercise 1 ===");
        Bentuk bentuk = new Bentuk("Biru");
        bentuk.printInfo();

        BujurSangkar bujurSangkar = new BujurSangkar(5.0, "Merah");
        bujurSangkar.printInfo();

        System.out.println("\n=== Output Exercise 2 ===");
        Lingkaran lingkaran = new Lingkaran(7.0, "Kuning");
        lingkaran.printInfo();

        Silinder silinder = new Silinder(10.0, 7.0, "Hijau");
        silinder.printInfo();
    }
}
