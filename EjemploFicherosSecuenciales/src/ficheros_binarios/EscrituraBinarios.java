package ficheros_binarios;

import java.io.*;

public class EscrituraBinarios {

    public static void main(String[] args) {
        File file =  new File("binarios.dat");
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file);
            DataOutputStream dos = new DataOutputStream(fos);
            for (int i = 0; i < 1000; i++) {
                dos.writeInt(i);
            }
            dos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
