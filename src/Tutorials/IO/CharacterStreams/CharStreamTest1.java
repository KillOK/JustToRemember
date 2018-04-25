package Tutorials.IO.CharacterStreams;

import java.io.*;

/**
 * Created by home on 24.04.2018.
 */
public class CharStreamTest1 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        InputStreamReader isr = null;
        try {
            fis = new FileInputStream("res/IO/byteStream/input.txt");
            isr = new InputStreamReader(fis, "UTF-8");
            char[] cbuf = new char[1024];
            int i = 0;
            while(i!=-1) i=isr.read(cbuf);
            System.out.println(new String(cbuf));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fis!=null) try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if(isr!=null) try {
                isr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
