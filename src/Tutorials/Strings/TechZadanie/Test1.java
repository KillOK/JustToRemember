package Tutorials.Strings.TechZadanie;

import java.io.*;
import java.util.ArrayList;

/**
 * This code check if there is special characters in the String and then removes them to the end of the String
 * input data ("res/Strings/TechZadanie/e-mail")
 * output ("res/Strings/TechZadanie/result.txt")
 */
public class Test1 {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        PrintWriter printWriter = null;
        ArrayList<String> inputList = new ArrayList<String>();
        try {
            bufferedReader = new BufferedReader(new FileReader("res/Strings/TechZadanie/e-mail"));
            printWriter = new PrintWriter(new FileWriter("res/Strings/TechZadanie/result.txt"));
            String s = null;
            while((s=bufferedReader.readLine())!=null){
                inputList.add(s.trim());
            }

            String buff = null;
            String result = null;

            for(String str : inputList){
                buff = str;
                result = new String(buff);
                //description of specChar
                String specChar = "@";
                String dot = ".";
                int i = 0;
                while (buff.contains(specChar)||buff.contains(dot)){  //If contains any of special character then we work...
                    if(buff.indexOf(specChar)==-1&&buff.indexOf(dot)!=-1)i = buff.indexOf(dot);  // Check if we have only one type of spec char
                    else if(buff.indexOf(specChar)!=-1&&buff.indexOf(dot)==-1)i = buff.indexOf(specChar);
                    else if(buff.indexOf(specChar)<buff.indexOf(dot)) i = buff.indexOf(specChar);   // If we have both types, then we start to work with thet one, which is closer to the start of the line
                    else i = buff.indexOf(dot);
                    result = buff.substring(0,i)+buff.substring(i+1)+result.substring(buff.length())+buff.substring(i,i+1);  // Forming of result strings
                    buff = buff.substring(0,i)+buff.substring(i+1);
                }
                printWriter.println(result);
            }
            printWriter.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (printWriter!=null)printWriter.close();
            if (bufferedReader!=null) try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
