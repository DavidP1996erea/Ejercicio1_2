import java.io.*;

public class Main_Random {
    public static void main(String[] args)  {

        RandomAccessFile ra = null;
        int puntero=0;

        try {
            ra = new RandomAccessFile(new File("palabrasSeparadas.txt"),"rw");


            while (ra.readLine()!=null) {

                ra.seek(puntero);
                System.out.println(ra.readLine());

                puntero+=6;
            }


            
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
