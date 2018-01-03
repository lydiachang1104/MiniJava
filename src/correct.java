import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.RuleContext;


public class correct extends BaseErrorListener {
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                            int line, int charPositionInLine, String msg,
                            RecognitionException e) {
        if (msg.startsWith("Lexical Error") || msg.startsWith("Semantic Error")) {
            System.err.println("line " + line + ":" + charPositionInLine + " " + msg);
            printErrorLine(recognizer, line);
        } else {
            msg = "Syntactic Error:" + msg;
            System.err.println("line " + line + ":" + charPositionInLine + " " + msg);
            underlineError(recognizer, (Token)offendingSymbol, line, charPositionInLine);
        }

    }
    protected void underlineError(Recognizer recognizer, Token offendingToken, int line,
                                  int charPositionInLine) {
        printErrorLine(recognizer, line);
        for (int i = 0; i < charPositionInLine; i++)
            System.err.print(" ");
        int start = offendingToken.getStartIndex();
        int stop = offendingToken.getStopIndex();
        if ( start >= 0 && stop >= 0 ) {
            for (int i=start; i<=stop; i++) System.err.print("^");
        }
        System.err.println();
    }

    protected void printErrorLine(Recognizer recognizer, int line) {
        CommonTokenStream tokens =
                (CommonTokenStream)recognizer.getInputStream();
        String input = tokens.getTokenSource().getInputStream().toString();
        String[] lines = input.split("\n");
        String errorLine = lines[line - 1];
        System.err.println(errorLine);
    }

}

public class scopeListener(){
    public void scopeCheck(RuleContext ctx,List<String> listtemp){
            if (ctx.getChildCount()==0)
                return;
            List<String> list = new ArrayList<String>();
            for (int i=0;i<ctx.getChildCount();i++) {
                ParseTree element = ctx.getChild(i);
                if (element instanceof VarDeclarationContext){
                    list.add(element.getChild(1));
                }
                listtemp.addAll(list);
                scopeCheck(element,listtemp)
            }
        }

    public expressionCheck(RuleContext ctx,List<String> listtemp){

        }
}



        def ExpressionCheck(node, xvars):
        EXPCLS = [MiniJavaParser.AssignStatementContext,
        MiniJavaParser.MulExpressionContext,
        MiniJavaParser.SubExpressionContext,
        MiniJavaParser.AddExpressionContext,
        MiniJavaParser.LtExpressionContext,
        MiniJavaParser.AndExpressionContext]
        if isinstance(node, tree.Tree.TerminalNodeImpl):
        if any([isinstance(node.parentCtx, cls) for cls in EXPCLS]):
        if str(node) not in ['*', '+', '-', '<', '&&', ';', '='] + xvars:
        print "Error: %d:%d near %s not defined." % (node.symbol.line, node.symbol.column, node.symbol.text)
        return False
        return True