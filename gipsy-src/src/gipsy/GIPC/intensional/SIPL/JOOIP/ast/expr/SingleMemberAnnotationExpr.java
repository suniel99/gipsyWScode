/*
 * Created on 21/11/2006
 */
package gipsy.GIPC.intensional.SIPL.JOOIP.ast.expr;

import gipsy.GIPC.intensional.SIPL.JOOIP.ast.visitor.GenericVisitor;
import gipsy.GIPC.intensional.SIPL.JOOIP.ast.visitor.VoidVisitor;

/**
 * @author Julio Vilmar Gesser
 */
public final class SingleMemberAnnotationExpr extends AnnotationExpr {

    public final NameExpr name;

    public final Expression memberValue;

    public SingleMemberAnnotationExpr(int line, int column, NameExpr name, Expression memberValue) {
        super(line, column);
        this.name = name;
        this.memberValue = memberValue;
    }

    @Override
    public <A> void accept(VoidVisitor<A> v, A arg) {
        v.visit(this, arg);
    }

    @Override
    public <R, A> R accept(GenericVisitor<R, A> v, A arg) {
        return v.visit(this, arg);
    }

}
