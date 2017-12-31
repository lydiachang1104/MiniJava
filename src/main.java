import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;


public class main {
    public static void main(String[] args) {
        ANTLRInputStream antlrstream;

        try {
            InputStream in = new FileInputStream("factorial.expr");

            antlrstream = new ANTLRInputStream(in);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return;
        }

        MiniJavaLexer lexer = new MiniJavaLexer(antlrstream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MiniJavaParser parser = new MiniJavaParser(tokens);
        String outstr = new tree().print(parser.goal().getRuleContext());
    }
}