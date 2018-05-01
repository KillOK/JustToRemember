package Tutorials.IO.ScanningAndFormating;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Created by home on 29.04.2018.
 */
public class ScannerTest1 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new BufferedReader(new FileReader("res/IO/byteStream/input.txt")));
            sc.useDelimiter(",\\s*");
            System.out.println(Character.isWhitespace('\\'));
            while(sc.hasNext()) System.out.println(sc.next());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
