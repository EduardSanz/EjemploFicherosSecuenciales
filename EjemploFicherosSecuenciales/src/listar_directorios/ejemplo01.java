package listar_directorios;

import java.io.File;
import java.util.*;

public class ejemplo01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime el directorio");
        listarFicherosDirActual(scanner.nextLine());
    }

    private static void listarFicherosDirActual(String dirActual) {

        File file = new File(dirActual);
        if (file.exists()) {
            String[] archivos = file.list();

            List<String> arrayList = Arrays.asList(archivos);
            arrayList.sort(new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.compareTo(o2) * -1;
                }
            });

            System.out.printf("Ficheros en el dir %s : %d %n", file.getName(), archivos.length);
            for (String fichero : arrayList) {
                File temp = new File(file, fichero);
                System.out.printf("Nombre: %s - FILE: %b - DIR: %b%n", temp.getName(), temp.isFile(), temp.isDirectory());
            }
        }
        else {
            System.out.println("Esa carpeta no existe");
        }
    }

}
