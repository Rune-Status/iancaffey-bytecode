package com.iancaffey.bytecode.io.attribute;

import com.iancaffey.bytecode.AttributeVisitor;
import com.iancaffey.bytecode.ClassReader;
import com.iancaffey.bytecode.util.AttributeHandler;

import java.io.IOException;

/**
 * MethodParametersHandler
 *
 * @author Ian Caffey
 * @since 1.0
 */
public class MethodParametersHandler implements AttributeHandler {
    @Override
    public void accept(ClassReader reader, AttributeVisitor visitor, int length) throws IOException {
        throw new UnsupportedOperationException();
    }
}