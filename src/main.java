import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;


//public class main {
//    public static void main(String[] args) {
//        ANTLRInputStream antlrstream;
//
//        try {
//            InputStream in = new FileInputStream("factorial.expr");
//
//            antlrstream = new ANTLRInputStream(in);
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//            return;
//        }
//
//        MiniJavaLexer lexer = new MiniJavaLexer(antlrstream);
//        CommonTokenStream tokens = new CommonTokenStream(lexer);
//        MiniJavaParser parser = new MiniJavaParser(tokens);
//        String outstr = new tree().print(parser.goal().getRuleContext());
//    }
//
//}

public class main {
    public static void main(String[] args)throws Exception {

        InputStream in = new FileInputStream("factorial.expr");


        ANTLRInputStream input=new ANTLRInputStream(in);
        MiniJavaLexer lexer=new MiniJavaLexer(input);
        CommonTokenStream tokens=new CommonTokenStream(lexer);
        MiniJavaParser parser=new MiniJavaParser(tokens);
        ParseTree tree=parser.goal();

        tree eval=new tree();
        eval.visit(tree);

        //print AST string
        System.out.println(tree.toStringTree(parser));

        //show GUI tree;
        org.antlr.v4.gui.Trees.inspect(tree,parser);
    }
}