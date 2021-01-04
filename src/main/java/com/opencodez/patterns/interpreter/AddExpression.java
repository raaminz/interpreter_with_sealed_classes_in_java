package com.opencodez.patterns.interpreter;

import com.opencodez.patterns.interpreter.internal.Expression;

public final class AddExpression implements Expression {
	private final String expression;

	public AddExpression(String expression) {
		this.expression = expression;
	}

	@Override
	public int interpret(InterpreterEngine ie) {
		return ie.add(expression);
	}
}
