package escritura;

import java.io.*;

public class EjemploEscritura {

    public static void main(String[] args) {
        File destino = new File("EjemploEscritura");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(destino,true));
            for (int i = 0; i < 1000; i++) {
                bw.write("Esta es la linea: "+ (i+1));
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
