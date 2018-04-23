package Tutorials.IO.ByteArray;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = null;
        FileInputStream fileInputStream = null;
        File file = null;
        try{
            fileOutputStream = new FileOutputStream("res/IO/byteStream/test2.txt");
            String s = "Test2\n";
            fileOutputStream.write(s.getBytes());
            /////////////////////////////////////
            fileInputStream = new FileInputStream("res/IO/byteStream/test2.txt");
            int buf;
            file = new File("res/IO/byteStream/test2.txt");
            /////////       This loop will read byte from file and write byte to this file endless... so we set limit into file size to 1024 bytes /////////////
            while ((buf = fileInputStream.read())!=-1&&file.length()<=1024){    // We are checking here if we have next byte and if file size isn't too big
                System.out.println("file.length() "+file.length());
                fileOutputStream.write(buf);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(fileInputStream!=null)fileInputStream.close();
            if(fileOutputStream!=null)fileOutputStream.close();
            if(file!=null){
                if(file.delete()) System.out.println("File successlully deleted");  // Just not to mess  memory. Important to call this method after closing of streams, which work with it...
            }

        }
    }
}
