import javax.swing.*;
import java.text.DecimalFormat;

public class CircleCalc {


    public static void main(String[] args) {

        public static void area() {
            DecimalFormat round = new DecimalFormat("#,##");

            double radius = Double.parseDouble(JOptionPane.showInputDialog("What is the radius of the circle?"));

            double area = Math.PI * Math.pow(radius, 2);

            JOptionPane.showMessageDialog(null, "the area is " + round.format(area));
        }
        //call the area method

        //call the circumference method




        public static void circumference(){

                double radius = Double.parseDouble(JOptionPane.showInputDialog("What is the radius of the circle?"));

                double circumference = 2 * Math.PI * radius;

                JOptionPane.showMessageDialog(null, "the area is " + circumference);
            }
    }

    //write a method to calculate a circle's area


    //write a method to calculate a circle's circumference

}
