package Tut_03;

import t3.TextIOPlus;
import t3.ast.ASTPrinter;

public class Ex_5 {
    public static void main(String[] args) {
        // program text
        String progText = TextIOPlus.readTextFileContent(Ex_5.class, "Hello.j");

        // Print AST
        ASTPrinter.print (progText);
    }
}
