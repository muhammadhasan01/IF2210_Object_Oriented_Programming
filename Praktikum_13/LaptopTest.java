import java.lang.*;
import java.lang.reflect.Method;
import java.lang.reflect.Field;

public class LaptopTest {
    // Anda boleh menambahkan atribut yang diperlukan
    private String className;

    public LaptopTest(String className) {
        /**
         * Memeriksa apakah ada kelas dengan nama className.
         * Jika tidak, tuliskan "Tidak ada kelas dengan nama yang diberikan" (tanpa petik) ke layar
         */
         this.className = className;
         try {
             Class cls = Class.forName(className);
         } catch (ClassNotFoundException e) {
             System.out.println("Tidak ada kelas dengan nama yang diberikan");
         }
    }

    public boolean testMethods() throws ClassNotFoundException {
        Method[] methods = Class.forName(className).getDeclaredMethods();
        boolean flag = true;
        if (methods.length == 1) {
            Method method = methods[0];
            method.setAccessible(true);
            if (!method.getName().equals("getRamSize")) {
                System.out.println("Nama method harus getRamSize");
                flag = false;
            }
            Class returnType = method.getReturnType();
            if (!returnType.getName().equals("int")) {
                System.out.println("Tipe return method harus Integer");
                flag = false;
            }
            // Jika nama method bukan getRamSize, tuliskan "Nama method harus getRamSize" (tanpa petik) ke layar
            // Jika tipe return bukan Integer, tuliskan "Tipe return method harus Integer" (tanpa petik) ke layar
        } else {
            // Menuliskan "Banyaknya method hanya boleh 1" (tanpa petik) ke layar
            System.out.println("Banyaknya method hanya boleh 1");
            flag = false;
        }
        // Return true jika semua tes berhasil
        // Jika ada 1 yang salah, return false
        return flag;
    }

    public boolean testFields() throws ClassNotFoundException {
        Field[] fields = Class.forName(className).getDeclaredFields();
        boolean flag = true;
        if (fields.length == 1) {
            Field field = fields[0];
            field.setAccessible(true);
            // Jika nama field bukan serialNumber, tuliskan "Nama field harus serialNumber" (tanpa petik) ke layar
            // Jika tipe return bukan String, tuliskan "Tipe field harus String" (tanpa petik) ke layar
            if (!field.getName().equals("serialNumber")) {
                System.out.println("Nama field harus serialNumber");
                flag = false;
            }
            if (!field.getType().equals("String")) {
                System.out.println("Tipe field harus String");
                flag = false;
            }
        } else {
            // Menuliskan "Banyaknya field hanya boleh 1" (tanpa petik) ke layar
            System.out.println("Banyaknya field hanya boleh 1");
            flag = false;
        }
        // Return true jika semua tes berhasil
        // Jika ada 1 yang salah, return false
        return flag;
    }
}