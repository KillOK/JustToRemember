package Tutorials.Strings.Test1;

import java.io.*;
import java.util.Scanner;

/**
 * Created by home on 03.05.2018.
 */
public class Test2Chars {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("res/Strings/TechZadanie/e-mail"));
            char[] chars = new char[1024];
            bufferedReader.read(chars);
            for (char c : chars) {
                System.out.println(new Character(c).toString()+"\nisLetter - "+Character.isLetter(c)
                +"\nisDigit - " + Character.isDigit(c)
                +"\nisWhiteSpace - " + Character.isWhitespace(c)
                +"\nisBmpCodePoint - " + Character.isBmpCodePoint(c)
                +"\nisTitleCase - " + Character.isTitleCase(c)
                +"\n" + Character.getName(c)
                +"\nisLetterOrDigit - " + Character.isLetterOrDigit(c) + "\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
