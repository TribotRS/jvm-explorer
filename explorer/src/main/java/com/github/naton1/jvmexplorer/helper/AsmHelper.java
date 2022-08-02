package com.github.naton1.jvmexplorer.helper;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.tree.ClassNode;

public class AsmHelper {

	public static ClassNode parse(byte[] classFile) {
		final ClassReader classReader = new ClassReader(classFile);
		final ClassNode classNode = new ClassNode();
		classReader.accept(classNode, 0);
		return classNode;
	}

	public static byte[] parse(int flags, ClassNode classNode) {
		final ClassWriter classWriter = new ClassWriter(null, flags);
		classNode.accept(classWriter);
		return classWriter.toByteArray();
	}

}
