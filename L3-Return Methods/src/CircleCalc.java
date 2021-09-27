import javax.swing.*;

public class CircleCalc {

    /*
    1. get input - get the radius
    2. calculate area
    3. calculate circumference
    4. display result
     */

    public static void main(String[] args) {

        //create and run the program

        double radius = getInput("please enter the radius");

        double area = area(radius);

        double circumference = circumference(radius);

        JOptionPane.showMessageDialog(null, displayResults(area, circumference));

    }
    public static double getInput(String message){

     return Double.parseDouble(JOptionPane.showInputDialog(message));

    }
    //re-write the method to calculate a circle's area using parameters and return statement
    public static double area(double radius){

        return Math.pow(radius, 2) * Math.PI;
    }

    //re-write the method to calculate a circle's perimeter using parameters and return statement

    public static double circumference(double radius){

        return 2 * Math.PI * radius;
    }

    public static String displayResults(double area, double perimeter);

    String message = "The area is "
    message += "The circumference is"

}
