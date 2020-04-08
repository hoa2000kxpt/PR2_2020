package Tut_03;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import utils.TextIO;

public class ProgWriter {
    public static void main(String[] args) {
        // program text
        final String TEMPALTE = "public class _ClassName_ {\r\n" +
                "public static void main(String[] args) {\r\n" +
                "System.out.println(_Getting_);\r\n" +
                "}\r\n" +
                "}";
         // get Classname from user
         System.out.print ("Enter your \"_ClassName_\": ");
         String className = TextIO.getlnString ();

         // get getting from user
         System.out.print ("Enter your \"_Getting_\" : ");
         String getting = TextIO.getlnString ();

        String progText = TEMPALTE.replace ("_ClassName_", className).replace ("_Getting_",getting);

        // parse the program text
        CompilationUnit codeUnit = JavaParser.parse(progText);
        // obtain the generated source code
        System.out.println(codeUnit);
    }
}


