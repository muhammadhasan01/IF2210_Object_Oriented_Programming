import java.util.HashMap;
import java.lang.reflect.Field;

public class Injector {
    // Menerima sebuah definisi dependencies
    // yang berupa sebuah instansiasi kelas
    // Catatan: Injector bisa menampung lebih dari 1 dependency,
    //          jadi injector bisa menginject banyak sekaligus.
    //          Jika ada 2 objek dengan kelas yang sama,
    //          inject dengan object terakhir yang di add ke daftar dependency
    HashMap<Class, Object> dependencies;

    public Injector() {
        dependencies = new HashMap<Class, Object>();
    }

    void addDependencies(Object object) {
        dependencies.put(object.getClass(), object);
    }
    /*
        Menginjeksi dependencies yang telah dibuat ke dalam objek
        Injeksi dilakukan dengan mengacu pada dependencies yang ditambah
        pada method addDependencies.

        Setiap field di object yang diinject, bila kelasnya
        sudah ditambahkan sebagai dependency, maka akan diset sebagai
        object yang sudah di add didependency.
    */
    void inject(Object object) throws Exception {
        Field[] fields = object.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            Class<?> CC = field.getType();
            if (dependencies.containsKey(CC)) {
                field.set(object, dependencies.get(CC));
            }
        }
    }   
}