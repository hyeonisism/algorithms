package org.hyeonisism.algorithms;


import java.util.Stack;

/**
 * @author hyeonisism
 */
public class Evaluate {

    public Double evaluate(String[] input) {

        Stack<String> ops = new Stack<>();
        
        Stack<Double> vals = new Stack<>();

        for (int i = 0; i < input.length; i++) {
            String argument = input[i];
            if (argument.equals("(")) {

            } else if (argument.equals("+")) {
                ops.push(argument);
            } else if (argument.equals("-")) {
                ops.push(argument);
            } else if (argument.equals("*")) {
                ops.push(argument);
            } else if (argument.equals("/")) {
                ops.push(argument);
            } else if (argument.equals("sqrt")) {
                ops.push(argument);
            } else if (argument.equals(")")) {
                String op = ops.pop();
                double v = vals.pop();
                if (op.equals("+")) {
                    v = vals.pop() + v;
                } else if (op.equals("-")) {
                    v = vals.pop() - v;
                } else if (op.equals("*")) {
                    v = vals.pop() * v;
                } else if (op.equals("/")) {
                    v = vals.pop() / v;
                } else if (op.equals("sqrt")) {
                    v = Math.sqrt(v);
                }
                vals.push(v);
            } else {
                vals.push(Double.parseDouble(argument));
            }
        }
        return vals.pop();
    }
}
