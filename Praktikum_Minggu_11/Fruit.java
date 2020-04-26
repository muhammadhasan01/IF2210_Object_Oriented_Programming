public class Fruit {
  private FruitType type;
  
  public Fruit(FruitType type) {
    this.type = type;
  }
  
  private void announceFruitType() {
    // Mencetak nama buah dalam bahasa Indonesia sesuai dengan type dan diakhiri new line
    // tanpa tanda kutip
    // Contoh: "Apel"
    if (type.equals(FruitType.APPLE)) {
        System.out.println("Apel");
    } else if (type.equals(FruitType.ORANGE)) {
        System.out.println("Jeruk");
    } else if (type.equals(FruitType.BANANA)) {
        System.out.println("Pisang");
    } else if (type.equals(FruitType.WATERMELON)) {
        System.out.println("Semangka");
    } else {
        assert false;
    }
    
    // Gunakan assert untuk mengetes asumsi bahwa kode tidak akan masuk ke bagian selain
    // FruitType yang telah didefinisikan
    // yowes
  }
  
  private void peel() {
    // Memastikan bahwa FruitType dari objek ini adalah ORANGE atau BANANA
    // ...
    if (type.equals(FruitType.BANANA)) {
        System.out.println("Peeling BANANA");
    } else if (type.equals(FruitType.ORANGE)) {
        System.out.println("Peeling ORANGE");
    } else {
        assert false;
    }

    // Mencetak "Peeling " tanpa tanda kutip diikuti dengan type dan new line
    // Contoh: "Peeling BANANA"
  }

  private void press() {
    // Memastikan bahwa FruitType dari objek ini adalah bukan BANANA
    // ...
    // Mencetak "Peeling " tanpa tanda kutip diikuti dengan type dan new line
    // Contoh: "Pressing WATERMELON"
    if (type.equals(FruitType.APPLE)) {
        System.out.println("Pressing APPLE");
    } else if (type.equals(FruitType.ORANGE)) {
        System.out.println("Pressing ORANGE");
    } else if (type.equals(FruitType.BANANA)) {
        assert false;
    } else if (type.equals(FruitType.WATERMELON)) {
        System.out.println("Pressing WATERMELON");
    }
  }

  private void removeCore() {
    // Memastikan bahwa FruitType dari objek ini adalah APEL
    // ...
    assert type.equals(FruitType.APPLE);
    System.out.println("Removing core APPLE");

    // Mencetak "Removing core " tanpa tanda kutip diikuti dengan type dan new line
    // Contoh: "Removing core APPLE"
  }

  // Suatu saat, bila ada programmer yang ingin menambahkan method public,
  // Ia sadar kalau tidak semua method dapat dipanggil, tergantung fruitType.
  // Method di atas private, sehingga boleh menggunakan assertion.
  // Bila public, sebaiknya menggunakan exception dibanding assertion.
}