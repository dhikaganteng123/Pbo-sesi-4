public class Main {
    public static void main(String[] args) {
        // Membuat objek BurungGagak
        BurungGagak gagak = new BurungGagak();
        gagak.suara(); // Memanggil metode suara dari BurungGagak

        // Membuat objek BurungMerpati
        BurungMerpati merpati = new BurungMerpati();
        merpati.suara(); // Memanggil metode suara dari BurungMerpati
        merpati.suara(3); // Memanggil metode suara dengan overloading dari BurungMerpati
    }
}

