// Definisikan kelas anak BurungMerpati yang merupakan turunan dari Burung
public class BurungMerpati extends Burung {
    // Implementasi overriding untuk metode suara
    @Override
    public void suara() {
        System.out.println("Merpati bersuara: \"Ku kuruku...\"");
    }

    // Metode overloading untuk mengeluarkan suara dengan parameter
    public void suara(int jumlahKuKu) {
        for (int i = 0; i < jumlahKuKu; i++) {
            System.out.print("ku ");
        }
        System.out.println();
    }
}

