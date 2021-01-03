package com.opencodez.patterns.interpreter.internal;

import com.opencodez.patterns.interpreter.InterpreterEngine;

public interface Expression {
	int interpret(InterpreterEngine ie);
}
