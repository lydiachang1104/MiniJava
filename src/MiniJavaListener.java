// Generated from MiniJava.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniJavaParser}.
 */
public interface MiniJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#goal}.
	 * @param ctx the parse tree
	 */
	void enterGoal(MiniJavaParser.GoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#goal}.
	 * @param ctx the parse tree
	 */
	void exitGoal(MiniJavaParser.GoalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void enterMainClass(MiniJavaParser.MainClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void exitMainClass(MiniJavaParser.MainClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(MiniJavaParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(MiniJavaParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#formallist}.
	 * @param ctx the parse tree
	 */
	void enterFormallist(MiniJavaParser.FormallistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#formallist}.
	 * @param ctx the parse tree
	 */
	void exitFormallist(MiniJavaParser.FormallistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#formalrest}.
	 * @param ctx the parse tree
	 */
	void enterFormalrest(MiniJavaParser.FormalrestContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#formalrest}.
	 * @param ctx the parse tree
	 */
	void exitFormalrest(MiniJavaParser.FormalrestContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MiniJavaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MiniJavaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MiniJavaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MiniJavaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MiniJavaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MiniJavaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#methodArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterMethodArgumentList(MiniJavaParser.MethodArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#methodArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitMethodArgumentList(MiniJavaParser.MethodArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#intArrayType}.
	 * @param ctx the parse tree
	 */
	void enterIntArrayType(MiniJavaParser.IntArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#intArrayType}.
	 * @param ctx the parse tree
	 */
	void exitIntArrayType(MiniJavaParser.IntArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#booleanType}.
	 * @param ctx the parse tree
	 */
	void enterBooleanType(MiniJavaParser.BooleanTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#booleanType}.
	 * @param ctx the parse tree
	 */
	void exitBooleanType(MiniJavaParser.BooleanTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#intType}.
	 * @param ctx the parse tree
	 */
	void enterIntType(MiniJavaParser.IntTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#intType}.
	 * @param ctx the parse tree
	 */
	void exitIntType(MiniJavaParser.IntTypeContext ctx);
}