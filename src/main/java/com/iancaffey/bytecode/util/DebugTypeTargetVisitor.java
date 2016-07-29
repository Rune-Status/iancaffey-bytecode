package com.iancaffey.bytecode.util;

import com.iancaffey.bytecode.LocalVariableTargetVisitor;
import com.iancaffey.bytecode.TypeTargetVisitor;

/**
 * DebugTypeTargetVisitor
 *
 * @author Ian Caffey
 * @since 1.0
 */
public class DebugTypeTargetVisitor extends DebugVisitor implements TypeTargetVisitor {
    public DebugTypeTargetVisitor() {
        super("TypeTarget");
    }

    public DebugTypeTargetVisitor(int indent) {
        super("TypeTarget", indent);
    }

    @Override
    public void visitParameter(int index) {

    }

    @Override
    public void visitSuperType(int index) {

    }

    @Override
    public void visitBoundParameterType(int parameterIndex, int boundIndex) {

    }

    @Override
    public void visitEmpty() {

    }

    @Override
    public void visitFormalParameter(int index) {

    }

    @Override
    public void visitThrows(int index) {

    }

    @Override
    public LocalVariableTargetVisitor visitLocalVariable(int count) {
        return new DebugLocalVariableTargetVisitor();
    }

    @Override
    public void visitCatch(int index) {

    }

    @Override
    public void visitOffset(int index) {

    }

    @Override
    public void visitTypeArgument(int offset, int index) {

    }
}
