package expression;

import java.util.Stack;
import java.util.regex.Pattern;

/*Evaluate expression takes care of evaluating the expression
 * 1.The expression in infix form is converted into postfix before being evaluated
 * 2.Naturally, precision rules and followed. 
 * 3.Stack based algorithms are used for 
 * 		a.infix to postfix conversion
 *		b.postfix expression evaluation */
public class EvaluateExpression {

	private Stack<Character> operatorStack;
	BinaryOperator binary_op;
	
	public EvaluateExpression(){
		operatorStack = new Stack<Character>();
		binary_op = new BinaryOperator();
	}
	
	public double evaluate(String expr){
		
		String postfix = convertIntoPostfix(expr);
		double answer = evaluatePostfix(postfix);
		
		return answer;
	} 
	
	public String convertIntoPostfix(String infix){
		
		StringBuilder postfix = new StringBuilder();
		
		for(int i = 0;i < infix.length();i++){
			
			char c = infix.charAt(i);
			
			if(!binary_op.isOperator(c))
				postfix.append(c);
			else if(c == '(')
				operatorStack.push(c);
			else if(c == ')'){
				while(!operatorStack.isEmpty() && operatorStack.peek() != '('){
					char popped_operand = operatorStack.pop();
					postfix.append(c);
				}
				operatorStack.pop();
			}
			else{
				postfix.append(" ");
				if(operatorStack.isEmpty() || operatorStack.peek() == '('){
					operatorStack.push(c);
				}
				else{
					while(!operatorStack.isEmpty() && (binary_op.getPrecedence(operatorStack.peek()) >= binary_op.getPrecedence(c))){
						char popped_operator = operatorStack.pop();
						postfix.append(popped_operator);
						postfix.append(" ");
					}
					operatorStack.push(c);
				}		
			}
		}
		
		while(!operatorStack.isEmpty()){
			postfix.append(" ");
			char popped_operator = operatorStack.pop();
			postfix.append(popped_operator);
		}
		
		return postfix.toString();
	}

	public double evaluatePostfix(String postfix)throws ArithmeticException{
		
		String[] components = postfix.split("\\s+");
		double answer = 0.0;
		Stack<Double> operandStack = new Stack<Double>();
 		
		for(int i = 0;i < components.length;i++){
			
			if(binary_op.isOperator(components[i].charAt(0))){
				double operand1 = operandStack.pop();
				double operand2 = operandStack.pop();
				
				double ans = binary_op.evaluateExpr(operand2, operand1,components[i].charAt(0));
				operandStack.add(ans);
			}		
			else{
				double operand_value = Double.parseDouble(components[i]);
				operandStack.push(operand_value);
			}
			
		}
		answer = operandStack.pop();
		
		return answer;
	}
}
