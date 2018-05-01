package Tutorials.Strings.Test1;

/**
 * Created by home on 30.04.2018.
 */
public class Test1Printf {
    public static void main(String[] args) {
        System.out.printf("The value of the float " +
                        "variable is %f, while " +
                        "the value of the " +
                        "integer variable is %d, " +
                        "the value of the next float  is" +
                        " %f "+
                        "and the string is %s",
                4111111.111345111, (int)49.1, 39f, "so... small...");
        // The same String s = String.format("the same input arguments...");  and then sout(s);...
    }
}
