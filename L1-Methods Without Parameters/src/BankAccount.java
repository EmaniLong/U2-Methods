import javax.swing.*;

public class BankAccount {

    //create a program which simulates a bank account

    public static void main(String[] args) {
        deposit();


        System.exit(0);
    }

    /*write a method to simulate a deposit.
    Prompt the user to enter their balance and the deposit amount,
    then display the new balance. */

    public static void deposit(){
        double balance Double.parseDouble(JOptionPane.showInputDialog("please enter your balance"));
        double deposit = Double.parseDouble(JOptionPane.showInputDialog("please enter the ammout you would like to deposit"));

        balance += deposit;

        JOptionPane.showInputDialog(null, "your new balance is: " + balance)
    }
    public static withdraw(){



        

    }



    /*write a method to simulate a withdrawal.
    Prompt the user to enter their balance the withdrawal amount,
    then display the new balance.
     */
}
