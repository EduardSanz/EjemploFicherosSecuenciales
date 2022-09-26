package creacion_ficheros;

import java.io.File;
import java.io.IOException;

public class Ejemplo02 {

    public static void main(String[] args) {
        // Cómo crear una nueva carpeta -> PRUEBAS
        File directorio = new File("PRUEBAS");
        directorio.mkdir();

        // Creamos dos ficheros nuevos
        File f1 = new File(directorio, "f1.txt");
        File f2 = new File(directorio, "f2.txt");

        try {
            boolean f1Created = f1.createNewFile();
            boolean f2Created = f2.createNewFile();

            if (f1Created)
                System.out.println("Fichero 1 creado");
            else
                System.out.println("Fichero 1 NO creado");

            if (f2Created)
                System.out.println("Fichero 2 creado");
            else
                System.out.println("Fichero 2 NO creado");
            // renombrar los ficheros
            if (f1Created){
                boolean renombrado = f1.renameTo(new File(directorio, "f1NEW.txt"));
                if (renombrado)
                    System.out.println("Fichero Renombrado");
                else
                    System.out.println("Error al renombrar el fichero");
            }
            // Borrar fichero o direcctorios
            boolean borrado = f2.delete();
            if (borrado)
                System.out.println("Fichero 2 borrado");
            else
                System.out.println("El fichero sigue vivo");


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
