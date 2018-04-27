package Tutorials.IO.BufferedStreams;

import java.io.*;

/**
 * Created by home on 27.04.2018.
 */
public class Test1BufferedIOStreams {
    public static void main(String[] args) {
        BufferedInputStream in = null;
        BufferedOutputStream out = null;
        try {
            in = new BufferedInputStream(new FileInputStream("res/IO/byteStream/input.txt"));
            out = new BufferedOutputStream(new FileOutputStream("res/IO/byteStream/output.txt"));
            int i;
            while ((i=in.read())!=-1){
                out.write(i);
            }
//            out.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(in!=null) try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if(out!=null) try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            File f = new File("res/IO/byteStream/output.txt");
            if(f.exists())f.delete();
        }
    }
}
