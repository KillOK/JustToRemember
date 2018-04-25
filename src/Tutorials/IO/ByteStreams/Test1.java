package Tutorials.IO.ByteStreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try{
            File file = new File("res/IO/byteStream/test1input.txt");
            if(file.exists()){
                fis = new FileInputStream("res/IO/byteStream/test1input.txt");
                fos = new FileOutputStream("res/IO/byteStream/test1output.txt",true);
                int c;
                byte[] b = new byte[2048];
                int i = 0;

                while((c=fis.read())!=-1){
                    b[i]=(byte)c;
                    i++;
                    fos.write(c);
                }
                fos.write("\nThis is all\n".getBytes());
                System.out.println(new String(b));
//                System.out.println(Arrays.toString(b));
            }else {
                System.out.println("File \"res/IO/input.txt\" doesnt exist");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            File outFile = new File("res\\IO\\output.txt");
            if(outFile.exists())outFile.delete();
        }
    }
}
