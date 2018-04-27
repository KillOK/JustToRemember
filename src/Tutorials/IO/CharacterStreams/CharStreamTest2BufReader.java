package Tutorials.IO.CharacterStreams;

import java.io.*;

/**
 * Created by home on 26.04.2018.
 */
public class CharStreamTest2BufReader {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        PrintWriter printWriter = null;
        String l;
        String s = new String();
        try {
            bufferedReader = new BufferedReader(new FileReader("res/IO/byteStream/input.txt"));
            printWriter = new PrintWriter(new FileWriter("res/IO/byteStream/output.txt",true));
            while((l=bufferedReader.readLine())!=null) {
                s = s + l+"\n";
            }
            printWriter.print("\nTa-da-da-damn it/\n");
            printWriter.print   (s);
            System.out.println(s);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (bufferedReader!=null) try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (printWriter!=null)  printWriter.close();
            File f = new File("res/IO/byteStream/output.txt");
            if(f!=null)f.delete();
        }
    }
}
