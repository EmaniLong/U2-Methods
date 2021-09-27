import javax.swing.*;

public class SplitPs {

    /*
    Assuming a String has a P, return a String containing the first p and the next 3 letters.

    "Hippopotamus" -> ppop
     */

    /*
    1. get input - a word hopfully with a p and letters
    2. isolate the p
    3. isolate the three letters after the p
    4. output
     */

    public static void main(String[] args) {
        String word= JOptionPane.showInputDialog("enter a word that has a p and three letters after it ");
        JOptionPane.showMessageDialog(null, splitP(word));
        System.exit(0);
    }

    public static String splitP(String word){
        int pIndex = word.indexOf("p");

        String split = word.substring(pIndex + 1, pIndex+4);

        return split;
    }


}

