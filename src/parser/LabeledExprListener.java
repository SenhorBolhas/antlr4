// Generated from D:/Materias/Compiladores/antlr4/g4Files\LabeledExpr.g4 by ANTLR 4.9.1
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LabeledExprParser}.
 */
public interface LabeledExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LabeledExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(LabeledExprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabeledExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(LabeledExprParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileLoopC}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoopC(LabeledExprParser.WhileLoopCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileLoopC}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoopC(LabeledExprParser.WhileLoopCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forLoopC}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterForLoopC(LabeledExprParser.ForLoopCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forLoopC}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitForLoopC(LabeledExprParser.ForLoopCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condi}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterCondi(LabeledExprParser.CondiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condi}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitCondi(LabeledExprParser.CondiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exp}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterExp(LabeledExprParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exp}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitExp(LabeledExprParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declar}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterDeclar(LabeledExprParser.DeclarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declar}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitDeclar(LabeledExprParser.DeclarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declarSimple}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterDeclarSimple(LabeledExprParser.DeclarSimpleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declarSimple}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitDeclarSimple(LabeledExprParser.DeclarSimpleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declarConst}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterDeclarConst(LabeledExprParser.DeclarConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declarConst}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitDeclarConst(LabeledExprParser.DeclarConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assing}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssing(LabeledExprParser.AssingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assing}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssing(LabeledExprParser.AssingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Println}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintln(LabeledExprParser.PrintlnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Println}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintln(LabeledExprParser.PrintlnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(LabeledExprParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(LabeledExprParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declarationExpr}
	 * labeled alternative in {@link LabeledExprParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationExpr(LabeledExprParser.DeclarationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declarationExpr}
	 * labeled alternative in {@link LabeledExprParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationExpr(LabeledExprParser.DeclarationExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declarationSimpleExpr}
	 * labeled alternative in {@link LabeledExprParser#declarationSimple}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSimpleExpr(LabeledExprParser.DeclarationSimpleExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declarationSimpleExpr}
	 * labeled alternative in {@link LabeledExprParser#declarationSimple}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSimpleExpr(LabeledExprParser.DeclarationSimpleExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declarationConstExpr}
	 * labeled alternative in {@link LabeledExprParser#declarationConst}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationConstExpr(LabeledExprParser.DeclarationConstExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declarationConstExpr}
	 * labeled alternative in {@link LabeledExprParser#declarationConst}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationConstExpr(LabeledExprParser.DeclarationConstExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionalExpr}
	 * labeled alternative in {@link LabeledExprParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpr(LabeledExprParser.ConditionalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionalExpr}
	 * labeled alternative in {@link LabeledExprParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpr(LabeledExprParser.ConditionalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionalExec}
	 * labeled alternative in {@link LabeledExprParser#conditionalExecExpr}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExec(LabeledExprParser.ConditionalExecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionalExec}
	 * labeled alternative in {@link LabeledExprParser#conditionalExecExpr}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExec(LabeledExprParser.ConditionalExecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileLoopExpr}
	 * labeled alternative in {@link LabeledExprParser#whileloop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoopExpr(LabeledExprParser.WhileLoopExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileLoopExpr}
	 * labeled alternative in {@link LabeledExprParser#whileloop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoopExpr(LabeledExprParser.WhileLoopExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forLoopExpr}
	 * labeled alternative in {@link LabeledExprParser#forloop}.
	 * @param ctx the parse tree
	 */
	void enterForLoopExpr(LabeledExprParser.ForLoopExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forLoopExpr}
	 * labeled alternative in {@link LabeledExprParser#forloop}.
	 * @param ctx the parse tree
	 */
	void exitForLoopExpr(LabeledExprParser.ForLoopExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assingNumber}
	 * labeled alternative in {@link LabeledExprParser#asignNumberExpr}.
	 * @param ctx the parse tree
	 */
	void enterAssingNumber(LabeledExprParser.AssingNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assingNumber}
	 * labeled alternative in {@link LabeledExprParser#asignNumberExpr}.
	 * @param ctx the parse tree
	 */
	void exitAssingNumber(LabeledExprParser.AssingNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assingString}
	 * labeled alternative in {@link LabeledExprParser#asignStringExpr}.
	 * @param ctx the parse tree
	 */
	void enterAssingString(LabeledExprParser.AssingStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assingString}
	 * labeled alternative in {@link LabeledExprParser#asignStringExpr}.
	 * @param ctx the parse tree
	 */
	void exitAssingString(LabeledExprParser.AssingStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSub(LabeledExprParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSub(LabeledExprParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(LabeledExprParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(LabeledExprParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(LabeledExprParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(LabeledExprParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddE}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddE(LabeledExprParser.AddEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddE}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddE(LabeledExprParser.AddEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(LabeledExprParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(LabeledExprParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code float}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFloat(LabeledExprParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code float}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFloat(LabeledExprParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(LabeledExprParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(LabeledExprParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Add}
	 * labeled alternative in {@link LabeledExprParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void enterAdd(LabeledExprParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link LabeledExprParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void exitAdd(LabeledExprParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringNumberSum}
	 * labeled alternative in {@link LabeledExprParser#stringNumberSumExpr}.
	 * @param ctx the parse tree
	 */
	void enterStringNumberSum(LabeledExprParser.StringNumberSumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringNumberSum}
	 * labeled alternative in {@link LabeledExprParser#stringNumberSumExpr}.
	 * @param ctx the parse tree
	 */
	void exitStringNumberSum(LabeledExprParser.StringNumberSumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link LabeledExprParser#stringexpr}.
	 * @param ctx the parse tree
	 */
	void enterString(LabeledExprParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link LabeledExprParser#stringexpr}.
	 * @param ctx the parse tree
	 */
	void exitString(LabeledExprParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sumString}
	 * labeled alternative in {@link LabeledExprParser#sumStringExpr}.
	 * @param ctx the parse tree
	 */
	void enterSumString(LabeledExprParser.SumStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sumString}
	 * labeled alternative in {@link LabeledExprParser#sumStringExpr}.
	 * @param ctx the parse tree
	 */
	void exitSumString(LabeledExprParser.SumStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparissonExpr}
	 * labeled alternative in {@link LabeledExprParser#comparisson}.
	 * @param ctx the parse tree
	 */
	void enterComparissonExpr(LabeledExprParser.ComparissonExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparissonExpr}
	 * labeled alternative in {@link LabeledExprParser#comparisson}.
	 * @param ctx the parse tree
	 */
	void exitComparissonExpr(LabeledExprParser.ComparissonExprContext ctx);
}