package com.iancaffey.bytecode.io.attribute;

import com.iancaffey.bytecode.AttributeVisitor;
import com.iancaffey.bytecode.BytecodeHandler;
import com.iancaffey.bytecode.ClassReader;
import com.iancaffey.bytecode.ElementValueVisitor;
import com.iancaffey.bytecode.util.AttributeHandler;

import java.io.IOException;

/**
 * AnnotationDefaultHandler
 *
 * @author Ian Caffey
 * @since 1.0
 */
public class AnnotationDefaultHandler implements AttributeHandler {
    private final BytecodeHandler<ClassReader, ElementValueVisitor> handler;

    public AnnotationDefaultHandler(BytecodeHandler<ClassReader, ElementValueVisitor> handler) {
        this.handler = handler;
    }

    @Override
    public void accept(ClassReader reader, AttributeVisitor visitor, int length) throws IOException {
        handler.accept(reader, visitor.visitAnnotationDefault());
    }
}
