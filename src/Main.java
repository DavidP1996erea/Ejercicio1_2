
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        FileReader fr = new FileReader(new File("palabras.txt"));
        FileWriter fw = new FileWriter("palabrasSeparadas.txt");

        BufferedReader br = new BufferedReader (fr);
        BufferedWriter bw = new BufferedWriter(fw);

        String palabras= "";

        Scanner sc = new Scanner(br);
        int i=0;
        int o=5;
        while(sc.hasNext()) {

            palabras=sc.next();

        }

        while (i<palabras.length()) {

            bw.write(palabras.substring(i, o));
            bw.append("\n");
            i=i+5;
            o=o+5;

        }

        bw.close();
    }
}