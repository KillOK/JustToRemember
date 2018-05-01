package Tutorials.IO.ScanningAndFormating;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by home on 29.04.2018.
 */
public class ScannerTest2 {
    public static void main(String[] args) {
        Scanner sc =null;
        float f = 0;
        try {
            sc = new Scanner(new BufferedReader(new FileReader("res/IO/byteStream/numbers")));
            sc.useLocale(Locale.US);
            while (sc.hasNext()){
                if(sc.hasNextFloat())f+=sc.nextFloat();
            }
            System.out.println(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            if(sc!=null)sc.close();
        }
    }
}
