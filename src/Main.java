import com.sun.tools.jconsole.JConsoleContext;

import javax.swing.*;
import java.awt.*;

public class Main
{

    public static String result(int score){
        String res;
        if(score >= 60 ){
            res = "PASSED";
        }else{
            res = "FAILED";
        }
        return res;
    }

    public static void addNum(){
        int num = 2;
        for(int i = num+1; i <=100; i ++){
            num = num + i;
        }
        System.out.println(num);
    }

    public static void primeNum(){
        int i;
        int count = 0;
        int num =5;
        int x = num / 2;

        for ( i = 2; i <= x; i++)
        {
            if (num % i != 0)
            {
                System.out.println("is prime");
                count = 1;
                break;
            }
            if(count == 0){
                System.out.println(num + " is prime");

            }else{
            System.out.println(num);
            }
        }
    }
    public static void series()throws NumberFormatException{
        JFrame myFrame = new JFrame("Fibonacci Series");

        JLabel myLabel = new JLabel("Enter a positive integer: ");

        JTextField myText = new JTextField("10");

        JButton clickMe = new JButton("Click Me!");

        myFrame.add(myLabel);
        myFrame.add(myText);
        myFrame.add(clickMe);

        myFrame.setLayout(new GridLayout(2,2));
        myFrame.setSize(500,400);
        myFrame.setVisible(true);
        System.out.println(result(70) + "\n");

        clickMe.addActionListener(e -> {
            if (e.getSource() == clickMe)
            {
                String text;
                text = myText.getText();

                int num = Integer.parseInt(text);

                int x = 0;
                int y = 1;
                int z = 0;
                for (int i = 1; i <= num; i++)
                {
                    x = y;
                    y = z;
                    z = x + y;

                    System.out.println(z);
                }
            }
        });


    }

    public static void main(String[] args)
    {

        //addNum();
        //System.out.println("\n");

        //primeNum();
        //System.out.println("\n");

        series();
    }
}