// Generated from bp.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link bpParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface bpVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link bpParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(bpParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignStm}
	 * labeled alternative in {@link bpParser#stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStm(bpParser.AssignStmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReadStm}
	 * labeled alternative in {@link bpParser#stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadStm(bpParser.ReadStmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WriteStm}
	 * labeled alternative in {@link bpParser#stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteStm(bpParser.WriteStmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link bpParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(bpParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolV}
	 * labeled alternative in {@link bpParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolV(bpParser.BoolVContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NegOp}
	 * labeled alternative in {@link bpParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegOp(bpParser.NegOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link bpParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(bpParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinOp}
	 * labeled alternative in {@link bpParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOp(bpParser.BinOpContext ctx);
}