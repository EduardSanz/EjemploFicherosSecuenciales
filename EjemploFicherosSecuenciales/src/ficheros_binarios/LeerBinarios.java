package ficheros_binarios;

import java.io.*;

public class LeerBinarios {
    public static void main(String[] args) {
        File file = new File("binarios.dat");
        try {
            FileInputStream fis = new FileInputStream(file);
            DataInputStream dis = new DataInputStream(fis);
            while (true) {
                int numero = dis.readInt();
                System.out.printf("El numero es: %d%n", numero);
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (EOFException eofException) {
            System.out.println("Lectura Terminado");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
