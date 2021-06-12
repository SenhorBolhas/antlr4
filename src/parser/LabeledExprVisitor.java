// Generated from D:/Materias/Compiladores/Implementacao2Unidade/g4Files\LabeledExpr.g4 by ANTLR 4.9.1
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LabeledExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LabeledExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(LabeledExprParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileLoopC}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoopC(LabeledExprParser.WhileLoopCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forLoopC}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoopC(LabeledExprParser.ForLoopCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condi}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondi(LabeledExprParser.CondiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exp}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(LabeledExprParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declar}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclar(LabeledExprParser.DeclarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarSimple}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarSimple(LabeledExprParser.DeclarSimpleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarConst}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarConst(LabeledExprParser.DeclarConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assing}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssing(LabeledExprParser.AssingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Println}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln(LabeledExprParser.PrintlnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Printlnstr}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintlnstr(LabeledExprParser.PrintlnstrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlank(LabeledExprParser.BlankContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarationExpr}
	 * labeled alternative in {@link LabeledExprParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationExpr(LabeledExprParser.DeclarationExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarationSimpleExpr}
	 * labeled alternative in {@link LabeledExprParser#declarationSimple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSimpleExpr(LabeledExprParser.DeclarationSimpleExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarationConstExpr}
	 * labeled alternative in {@link LabeledExprParser#declarationConst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationConstExpr(LabeledExprParser.DeclarationConstExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionalExpr}
	 * labeled alternative in {@link LabeledExprParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpr(LabeledExprParser.ConditionalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileLoopExpr}
	 * labeled alternative in {@link LabeledExprParser#whileloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoopExpr(LabeledExprParser.WhileLoopExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forLoopExpr}
	 * labeled alternative in {@link LabeledExprParser#forloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoopExpr(LabeledExprParser.ForLoopExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assingNumber}
	 * labeled alternative in {@link LabeledExprParser#asignNumberExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssingNumber(LabeledExprParser.AssingNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assingString}
	 * labeled alternative in {@link LabeledExprParser#asignStringExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssingString(LabeledExprParser.AssingStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(LabeledExprParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(LabeledExprParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(LabeledExprParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(LabeledExprParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code float}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(LabeledExprParser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(LabeledExprParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link LabeledExprParser#stringexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(LabeledExprParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code concatString}
	 * labeled alternative in {@link LabeledExprParser#concatStringexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatString(LabeledExprParser.ConcatStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sumString}
	 * labeled alternative in {@link LabeledExprParser#sumStringExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumString(LabeledExprParser.SumStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparissonExpr}
	 * labeled alternative in {@link LabeledExprParser#comparisson}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparissonExpr(LabeledExprParser.ComparissonExprContext ctx);
}