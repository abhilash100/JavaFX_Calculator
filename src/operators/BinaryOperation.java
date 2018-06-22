package operators;

import expression.BinaryOperator;
import expression.Expression;

/*Implementation of action handler on pressing the operators buttons*/
public class BinaryOperation implements Pressable{

	BinaryOperator binary_op = new BinaryOperator();

	public void OnPress(Expression expr, char operator,boolean lastPressedEnter) {
		
		if(lastPressedEnter){
			String ans = Double.toString(expr.getAnswer());
			for(int i = 0;i < ans.length();i++){
				expr.getExpression().add(ans.charAt(i));
			}
			expr.setAnswer(0);
		}

			if(binary_op.isOperator(expr.getLast())){
				expr.removeLast();
				expr.getExpression().add(operator);
			}
			else
				expr.getExpression().add(operator);

		
	}
}
