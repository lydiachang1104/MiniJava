import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.tree.ParseTree;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class scope {

    //visit the whole tree
    public void mytreevisit(RuleContext ctx) {
        List<String> varlist = new ArrayList<String>();
        visit(ctx,varlist);
    }

    //visit the tree and the child tree (digui.....= =)
    private void visit(RuleContext ctx, List<String> list) {
        String ruleName = MiniJavaParser.ruleNames[ctx.getRuleIndex()];
        //System.out.println(ruleName);
        List<String> localvarlist = new ArrayList<String>();
        for (int i=0;i<ctx.getChildCount();i++) {
            ParseTree element = ctx.getChild(i);
            if (element instanceof MiniJavaParser.VarDeclarationContext) {
                //System.out.println("varname: "+element.getChild(1).getText());
                localvarlist.add(element.getChild(1).getText());
            }
            if (element instanceof MiniJavaParser.ClassDeclarationContext) {
                //System.out.println("varname: "+element.getChild(1).getText());
                localvarlist.add(element.getChild(1).getText());
            }
            if (element instanceof MiniJavaParser.MainClassContext) {
                //System.out.println("varname: "+element.getChild(1).getText());
                localvarlist.add(element.getChild(1).getText());
            }
            if (element instanceof MiniJavaParser.FormalListContext) {
                //System.out.println("varname: "+element.getChild(1).getText());
                localvarlist.add(element.getChild(1).getText());
            }
            if (element instanceof MiniJavaParser.MethodDeclarationContext) {
                //System.out.println("varname: "+element.getChild(1).getText());
                localvarlist.add(element.getChild(2).getText());
            }
            list.addAll(localvarlist);
            System.out.println("Mylist: "+list);
            if (element instanceof TerminalNode) {
                checkTerminal((TerminalNode) element, list);
            }
            if (element.getChildCount()>0) {
                visit((RuleContext) element, list);
            }
        }
    }

    private void checkTerminal(TerminalNode element, List<String> list) {

            int type = element.getSymbol().getType();
            if (type == MiniJavaParser.ID) {
                if (!(list.contains(element.getText()))) {
                    System.out.println("Error: " + element.getText() + " not defined");
                }
            }

    }
}