package com.opencodez.patterns.interpreter.client;

import com.opencodez.patterns.interpreter.AddExpression;
import com.opencodez.patterns.interpreter.InterpreterEngine;
import com.opencodez.patterns.interpreter.SubtractExpression;
import com.opencodez.patterns.interpreter.internal.Expression;

import java.util.Objects;

public class InterpreterClient {
	
	private InterpreterEngine ie;
	
	public InterpreterClient(InterpreterEngine ie) {
		this.ie = ie;
	}
	
	public int interpret(String input) {
		Objects.requireNonNull(input);

		Expression exp = null;
		
		if(input.contains("add")) {
			exp = new AddExpression(input);
		} else if(input.contains("subtract")) {
			exp = new SubtractExpression(input);
		}else {
			throw new IllegalArgumentException("Input %s not supported".formatted(input));
		}
		
		int result = exp.interpret(ie);
		System.out.println(input);
		
		return result;
	}
	
	public static void main(String args[]) {
		
		InterpreterClient ic = new InterpreterClient(new InterpreterEngine());
		
		System.out.println("Result = " + ic.interpret("add 12 and 13"));
		System.out.println("Result = " + ic.interpret("subtract 76 from 621"));
	}

}
