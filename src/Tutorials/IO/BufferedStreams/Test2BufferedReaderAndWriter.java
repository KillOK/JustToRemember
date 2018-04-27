package Tutorials.IO.BufferedStreams;

import java.io.*;

/**
 * Created by home on 27.04.2018.
 */
public class Test2BufferedReaderAndWriter {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bufferedWriter = null;
        try {
            br = new BufferedReader(new FileReader("res/IO/byteStream/input.txt"));
            bufferedWriter = new BufferedWriter(new FileWriter("res/IO/byteStream/output.txt"));
            String s;
            String result = null;
            while((s=br.readLine())!=null){
                System.out.println(s);
                result = result+s+"\n";
            }
            bufferedWriter.write(result);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(br!=null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bufferedWriter!=null){
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            File f = new File("res/IO/byteStream/output.txt");
            if(f.exists())f.delete();
        }
    }
}
