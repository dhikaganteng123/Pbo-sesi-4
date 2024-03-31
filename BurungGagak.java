// Definisikan kelas anak BurungGagak yang merupakan turunan dari Burung
public class BurungGagak extends Burung {
    // Implementasi overriding untuk metode suara
    @Override
    public void suara() {
        System.out.println("Gagak bersuara: \"Kraa... Kraa...\"");
    }
}

