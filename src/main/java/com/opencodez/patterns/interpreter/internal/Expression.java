package com.opencodez.patterns.interpreter.internal;

import com.opencodez.patterns.interpreter.AddExpression;
import com.opencodez.patterns.interpreter.InterpreterEngine;
import com.opencodez.patterns.interpreter.SubtractExpression;

public sealed interface Expression permits
		AddExpression, SubtractExpression {
	int interpret(InterpreterEngine ie);
}
