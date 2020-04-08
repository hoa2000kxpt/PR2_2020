package Tut_03;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import t3.TextIOPlus;


public class Ex_2 {
    public static void main(String[] args) {
        // program text
        String progText = TextIOPlus.readTextFileContent(Ex_2.class, "Hello.j");
        // parse the program text
        CompilationUnit codeUnit = JavaParser.parse (progText);
        // obtain the generated source code
        System.out.println (codeUnit);
    }
}
