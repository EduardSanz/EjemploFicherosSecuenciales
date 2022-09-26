package lectura;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class EjemploLectura {

    public static void main(String[] args) {

        // Fichero de destino
        File fichero = new File("EjemploLectura.txt");
        ArrayList<String> lineas = new ArrayList<>();


        try {
            FileReader fr = new FileReader(fichero);
            BufferedReader bf = new BufferedReader(fr);

            String linea = null;
            while ( (linea = bf.readLine()) != null ) {
                lineas.add(linea);
            }

            if (lineas.size() > 0) {
                System.out.printf("El fichero tiene %d lineas, dime la linea a mostrar%n", lineas.size());
                Scanner scanner = new Scanner(System.in);
                int numLinea = scanner.nextInt();
                try {
                    System.out.println(lineas.get(numLinea - 1));
                }
                catch (IndexOutOfBoundsException exception){
                    System.out.println("Esa linea no existe");
                }
                finally {
                    bf.close();
                    fr.close();
                }
            }else {
                System.out.println("El fichero está vacio");
            }

        } catch (FileNotFoundException e) {
            System.out.println("El fichero no existe");
        } catch (IOException e) {
            System.out.println("No tengo permisos para leer");
        }




    }

}
