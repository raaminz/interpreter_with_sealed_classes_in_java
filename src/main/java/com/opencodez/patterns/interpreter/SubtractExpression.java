package com.opencodez.patterns.interpreter;

import com.opencodez.patterns.interpreter.internal.Expression;

public final class SubtractExpression implements Expression {
	private final String expression;

	public SubtractExpression(String expression) {
		this.expression = expression;
	}

	@Override
	public int interpret(InterpreterEngine ie) {
		return ie.subtract(expression);
	}
}
