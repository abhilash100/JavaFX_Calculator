package expression;

import java.util.ArrayList;
import java.util.Stack;

/*
 * 1.Expression class stores the expression typed into the text field in the form of an 
 * ArrayList of characters. 
 * 2.It allows the user to get the expression and to add and remove the 
 * last added characters*/
public class Expression {

	private ArrayList<Character> expression = new ArrayList<Character>();
	private double answer;
	
	public ArrayList<Character> getExpression() {
		return expression;
	}
	public char getLast(){
		return expression.get(expression.size()-1);
	}
	public void removeLast(){
		expression.remove(expression.size()-1);
	}
	
	public String convertIntoString(){
		StringBuilder sb = new StringBuilder();
		
		for(Character c : expression){
			sb.append(c);
		}
		
		return sb.toString();
	}
	
	public int getLastOperatorIndex(){
		
		BinaryOperator binary_op = new BinaryOperator();
		int index = -1;
		
		for(int i = 0;i < expression.size();i++){
			if(binary_op.isOperator(expression.get(i)))
				index = i;
		}
		return index;
	}
	
	public int getLastDotIndex(){

		int index = -1;
		
		for(int i = 0;i < expression.size();i++){
			if(expression.get(i) == '.')
				index = i;
		}
		
		return index;
	}
		
	public double getAnswer(){
		return answer;
	}
	
	public void setAnswer(double answer){
		this.answer = answer;
	}

}
