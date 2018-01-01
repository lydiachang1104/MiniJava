import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.tree.ParseTree;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.*;


public class tree {
    //visit the whole tree
    public void myASTvisit(RuleContext ctx) {
        visit(ctx, 0);
    }

//    private void printRule(RuleContext ctx){
//        int count = ctx.getChildCount();
//        String result = ctx.getText();
//        for (int i=0;i<count;i++){
//            System.out.print(ctx.getChild(i).getText());
//            result.replace(String(ctx.getChild(i).getText())," ");
//            System.out.println(" "+result);
//        }
//    }

    //visit the tree and the child tree (digui.....= =)
    private void visit(RuleContext ctx, int level) {
        String ruleName = MiniJavaParser.ruleNames[ctx.getRuleIndex()];
        nodeLevel(level);
//        System.out.print(ruleName + " ");
//        printRule(ctx);
        System.out.println(ruleName);
        for (int i=0;i<ctx.getChildCount();i++) {
            ParseTree element = ctx.getChild(i);
            if (element instanceof RuleContext) {
                visit((RuleContext)element, level + 1);

            } else if (element instanceof TerminalNode) {
                visitTerminal((TerminalNode) element, level + 1);
            }
        }
    }

    private void visitTerminal(TerminalNode element, int level) {
        int type = element.getSymbol().getType();
        if (type == MiniJavaParser.ID) {
            nodeLevel(level);
            System.out.println("Identifier: "+element.getText());
            return;
        }
        if (type == MiniJavaParser.INT) {
            nodeLevel(level);
            System.out.println( "Int: " +element.getText());
            return;
        }
        if (type == MiniJavaParser.BOOL) {
            nodeLevel(level);
            System.out.println("Boolean: "+element.getText());
            return;
        }
    }

    private void nodeLevel(int level) {
        int temp = level;
        if (level > 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("  ");
            }
            System.out.print(temp+" ");
        }

    }
}