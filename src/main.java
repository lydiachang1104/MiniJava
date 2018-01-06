import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.gui.*;
import org.antlr.v4.misc.*;

import java.io.*;
import java.io.Console;


public class main {
    public static void main(String[] args) throws Exception{
        ANTLRInputStream antlrstream;


        InputStream in = new FileInputStream("factorial.expr");
        antlrstream = new ANTLRInputStream(in);


        MiniJavaLexer lexer = new MiniJavaLexer(antlrstream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MiniJavaParser parser = new MiniJavaParser(tokens);

        parser.removeErrorListeners();
        parser.addErrorListener(new correct());
        //new scope().mytreevisit(parser.goal().getRuleContext());
        new tree().myASTvisit(parser.goal().getRuleContext());
    }
}

