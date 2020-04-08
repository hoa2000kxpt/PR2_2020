package Tut_01;

import utils.TextIO;

public class Ex3_3 {
    public static void main(String[] args) {
        while (true) {
            System.out.print ("Enter your expressions: ");
            double firstNum = TextIO.getDouble ();
            char symbol = TextIO.getChar ();
            double secondNum = TextIO.getlnDouble ();
            double value = 0;


            switch (symbol) {
                case '+':
                    value = firstNum + secondNum;
                  break;
                case '-':
                    value = firstNum - secondNum;
                    break;
                case '*':
                     value = firstNum * secondNum;
                    break;
                case '/':
                     value = firstNum / secondNum;
                    break;
                default:
                    System.out.println ("Invalid input! Please try again");
                    continue;
            }
            System.out.println ("Value is " + value);
        }
    }
}
