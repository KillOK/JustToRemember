package Tutorials.Strings.TechZadanie;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by home on 06.05.2018.
 */
public class Test2 {
    public static void main(String[] args) {
        PrintWriter printWriter = null;
        BufferedReader bufferedReader = null;
        File f = null;
        ArrayList<String> buffer = new ArrayList<String>();
        ArrayList<Character> specCharBuffer = new ArrayList<Character>();

        try {
            printWriter = new PrintWriter(new FileWriter("res/Strings/TechZadanie/result.txt", true));
            bufferedReader = new BufferedReader(new FileReader("res/Strings/TechZadanie/e-mail"));
            f = new File("res/Strings/TechZadanie/result.txt");
            String s = null;
            String resultString = "";
            String inputString = "";
//            Here I tried to chose separate words from line
//            I could also use Scanner.hasNext() or just trim functions, But for me was interesting algorithm
            while((s = bufferedReader.readLine())!=null){
                int wordBeginIndex = 0;
                int wordEndIndex = 0;
                for(int i=0; i<s.length(); i++){

                    if(i==0){
                        if(Character.isWhitespace(s.charAt(i))){
                            wordBeginIndex = i+1;
                            wordEndIndex = i+1; // to avoid exception
                        }else{
                            wordBeginIndex = i;
                            wordEndIndex = i;
                        }
                    }

                    else if(Character.isWhitespace(s.charAt(i-1))&&Character.isWhitespace(s.charAt(i))&&!Character.isWhitespace(s.charAt(i+1))){
                        wordEndIndex = i+1;
                        wordBeginIndex = i+1;
                    }

                    else if(i==s.length()-1){
                        if(Character.isWhitespace(s.charAt(i))){
                            wordEndIndex = i;
                        }else{
                            wordEndIndex = i+1;
                        }
                        buffer.add(s.substring(wordBeginIndex, wordEndIndex));
                    }

                    else if(Character.isWhitespace(s.charAt(i))&&!Character.isWhitespace(s.charAt(i-1))){
                        wordEndIndex = i;
                        buffer.add(s.substring(wordBeginIndex, wordEndIndex));
                        wordBeginIndex = i+1;
                    }
                }
                // Слова в масиві переробити згідно вимог двома способами(методами) по черзі
                // Записати результат в файл
            }
            for(String str:buffer) System.out.println(str);
            System.out.println("buffer.size(): "+buffer.size());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            // Close all opened
            // Finish the app, commit and push
            // Start sorting app with Comparator usage (Sort String array)
            // Start sorting app with Comparator usage (Sort String array with separare words and numbers)

        }

    }

    // Використовує регексп
    private static String regexBuilder(){
        return new String();
    }

    private static String charBuilder(){
        return new String();
    }
}
