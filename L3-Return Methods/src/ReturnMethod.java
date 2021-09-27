import javax.swing.*;

public class ReturnMethod {

    public static void main(String[] args) {
        double length = Double.parseDouble(JOptionPane.showInputDialog("what is the lenght?"));
        double width = Double.parseDouble(JOptionPane.showInputDialog("what is the width?" +));

        JOptionPane.showMessageDialog(null,"the area is" + area(length,width) + "\nThe perimeter is" + perimeter(length,width));
    }

    public static double area(double length, double width){

        return  length * width;

    }

    public static double perimeter(double length, double width){

        return 2 * (width + length);
    }
