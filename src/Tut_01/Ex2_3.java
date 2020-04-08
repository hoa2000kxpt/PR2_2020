package Tut_01;

import utils.TextIO;

public class Ex2_3 {
    public static void main(String[] args) {
        System.out.print ("Input your name: ");
        String name = TextIO.getlnString ();
        String nameUppercase = name.toUpperCase ();

        System.out.println ("Hello, " + nameUppercase +  ", nice to meet you!");
    }
}
