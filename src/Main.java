import Calculator.node.*;
import Calculator.parser.*;
import Calculator.lexer.*;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //TODO code application logic here

        try{
            int yes = 1;
            do {
                System.out.println("");
                System.out.println("Type an arithmetic expression");
                String str = new Scanner(System.in).nextLine();
                //Create a parser instance
                Parser p = new Parser(new Lexer(new PushbackReader(new StringReader(str),1024)));
                // Parse the input and build the syntax tree.
                Start tree = p.parse();
                // Apply a translation on the syntax tree.
                System.out.print("PostFix Expression: ");
                tree.apply(new PostFixTranslation());
                System.out.print("\nPrefix Expression: ");
                tree.apply(new PreFixTranslation());
                System.out.print("\nGetting answer...");
                tree.apply(new Evaluation());
                System.out.println("\n");
                System.out.println("Do you wish to enter another expression? \n 1 => YES, 0 => NO");
                yes = new Scanner(System.in).nextInt();
            } while ( yes == 1);
            System.exit(0);
        }catch (Exception e){
            System.out.println("Error occurs: "+e.getMessage() );
            e.printStackTrace();
        }
    }
}
