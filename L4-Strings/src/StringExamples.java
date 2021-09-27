import java.util.Locale;

public class StringExamples {


    public static void main(String[] args) {
        String name = "Timmy";
        String greeting = "hello";

        int stringSize = name.length();

        System.out.println(name + " has " + stringSize + "letters.");

        System.out.println(greeting + "has " + greeting.length() + "letters.");


        //attempt 1
        //plan
        //1. get input
        //2. isolate first letter
        //3. capitalize first letter
        //4. isolate the rest of the letters
        //5. put 3 and 4 together
        //6. display results

        System.out.println(capFirst(name));

    }

    public static String capFirst(String name){

        String letter = name.substring (0,1);
        letter = letter.toUpperCase();

        return letter + name.substring(1);


    }


}
