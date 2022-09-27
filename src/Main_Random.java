import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main_Random {
    public static void main(String[] args) {


        /* Se crea la lista y el objeto randomAccessFile. También se inicializa el puntero que marcará en que palabra
        estamos y se crea el fichero de salida */
        RandomAccessFile ra = null;
        RandomAccessFile rw = null;

        List<String> listaPalabras = new ArrayList<>();
        int puntero = 0;
        File ficheroSalida = new File("palabrasOrdenadas.txt");
        try {

            // Se llama al fichero correspendiente con el objeto RandomAccessFile
            ra = new RandomAccessFile(new File("palabrasSeparadas.txt"), "rw");
            rw = new RandomAccessFile(ficheroSalida, "rw");

            // Se recorre el fichero y se mete cada palabra en una lista
            while (ra.readLine() != null) {

                ra.seek(puntero);

                listaPalabras.add(ra.readLine());

                puntero += 6;
            }

            //Se ordena por orden alfabético
            Collections.sort(listaPalabras);

            // Se escribe en el fichero de salida
            for (String e : listaPalabras) {

               rw.writeBytes(e +"\n");

            }



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
